package User;

import java.util.HashMap;
import Balance.Balance;

public class UserVsBalanceSheet {
    double totalAmountExpense; //Total amount, all share
    double totalAmountOwe;
    double totalPaymentMade; //Actual payment made
    double totalAmountGetBack;
    HashMap<String, Balance>  balanceMap;

    public UserVsBalanceSheet() {
        this.balanceMap = new HashMap<String,Balance>();
        this.totalAmountExpense = 0;
        this.totalAmountOwe = 0;
        this.totalPaymentMade = 0;
        this.totalAmountGetBack = 0;
    }

    public double getTotalAmountExpense() {
        return totalAmountExpense;
    }
    public void setTotalAmountExpense(double totalAmountExpense) {
        this.totalAmountExpense = totalAmountExpense;
    }
    public double getTotalAmountOwe() {
        return totalAmountOwe;
    }
    public void setTotalAmountOwe(double totalAmountOwe) {
        this.totalAmountOwe = totalAmountOwe;
    }
    public double getTotalPaymentMade() {
        return totalPaymentMade;
    }
    public void setTotalPaymentMade(double totalPaymentMade) {
        this.totalPaymentMade = totalPaymentMade;
    }
    public double getTotalAmountGetBack() {
        return totalAmountGetBack;
    }
    public void setTotalAmountGetBack(double totalAmountGetBack) {
        this.totalAmountGetBack = totalAmountGetBack;
    }
    public HashMap<String, Balance> getBalanceMap() {
        return this.balanceMap;
    }
    public void setBalanceMap(HashMap<String, Balance> balanceMap) {
        this.balanceMap = balanceMap;
    }
}
