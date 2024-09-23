package Balance;
import User.User;
import java.util.List;
import java.util.Map;

import Split.Split;
import User.UserVsBalanceSheet;

public class BalanceController {

    public void updateUserExpenseBalanceSheet(User expensePaidBy, List<Split> splits, double totalExpenseAmount){

        //update the total amount paid of the expense paid by user
        UserVsBalanceSheet paidByUserExpenseSheet = expensePaidBy.getBalanceSheet();
        paidByUserExpenseSheet.setTotalAmountExpense(paidByUserExpenseSheet.getTotalAmountExpense() + totalExpenseAmount);

        for(Split split : splits) {

            User userOwe = split.getUser();
            UserVsBalanceSheet oweUserExpenseSheet = userOwe.getBalanceSheet();
            double oweAmount = split.getAmountOwe();

            if(expensePaidBy.getUserId().equals(userOwe.getUserId())){
                paidByUserExpenseSheet.setTotalYourExpense(paidByUserExpenseSheet.getTotalYourExpense()+oweAmount);
            }
            else {

                //update the balance of paid user
                paidByUserExpenseSheet.setTotalYouGetBack(paidByUserExpenseSheet.getTotalYouGetBack() + oweAmount);

                Balance userOweBalance;
                if(paidByUserExpenseSheet.getBalanceMap().containsKey(userOwe.getUserId())) {

                    userOweBalance = paidByUserExpenseSheet.getBalanceMap().get(userOwe.getUserId());
                }
                else {
                    userOweBalance = new Balance();
                    paidByUserExpenseSheet.getBalanceMap().put(userOwe.getUserId(), userOweBalance);
                }

                userOweBalance.setAmountGetBack(userOweBalance.getAmountGetBack() + oweAmount);


                //update the balance sheet of owe user
                oweUserExpenseSheet.setTotalYouOwe(oweUserExpenseSheet.getTotalYouOwe() + oweAmount);
                oweUserExpenseSheet.setTotalYourExpense(oweUserExpenseSheet.getTotalYourExpense() + oweAmount);

                Balance userPaidBalance;
                if(oweUserExpenseSheet.getBalanceMap().containsKey(expensePaidBy.getUserId())){
                    userPaidBalance = oweUserExpenseSheet.getBalanceMap().get(expensePaidBy.getUserId());
                }
                else{
                    userPaidBalance = new Balance();
                    oweUserExpenseSheet.getBalanceMap().put(expensePaidBy.getUserId(), userPaidBalance);
                }
                userPaidBalance.setAmountOwe(userPaidBalance.getAmountOwe() + oweAmount);
            }
        }
    }

    public void showBalanceSheetOfUser(User user){

        System.out.println("---------------------------------------");

        System.out.println("Balance sheet of user : " + user.getUserId());

        UserVsBalanceSheet userExpenseBalanceSheet =  user.getBalanceSheet();

        System.out.println("TotalYourExpense: " + userExpenseBalanceSheet.getTotalYourExpense());
        System.out.println("TotalGetBack: " + userExpenseBalanceSheet.getTotalYouGetBack());
        System.out.println("TotalYourOwe: " + userExpenseBalanceSheet.getTotalYouOwe());
        System.out.println("TotalPaymnetMade: " + userExpenseBalanceSheet.getTotalPayment());
        for(Map.Entry<String, Balance> entry : userExpenseBalanceSheet.getBalanceMap().entrySet()){

            String userID = entry.getKey();
            Balance balance = entry.getValue();

            System.out.println("userID:" + userID + " YouGetBack:" + balance.getAmountGetBack() + " YouOwe:" + balance.getAmountOwe());
        }

        System.out.println("---------------------------------------");

    }

}
