package Expense;

import Balance.BalanceController;
import Split.Split;
import Split.SplitFactory;
import User.User;

import java.util.List;

public class ExpenseController {
    BalanceController balanceController;

    public ExpenseController() {
        this.balanceController = new BalanceController();
    }

    public Expense createExpense(String expenseName, User paidByUser, double expenseAmount, List<Split> splits, ExpenseSplitType expenseSplitType) {
       if(SplitFactory.getExpenseSplit(expenseSplitType).validSplit(splits, expenseAmount)) {
           Expense expense = new Expense(expenseName, paidByUser, expenseAmount, splits, expenseSplitType);

           balanceController.updateUserVsBalanceSheet(paidByUser, expenseAmount, splits);
           return expense;
       }
        return null;
    }
}
