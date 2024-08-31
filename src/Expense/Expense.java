package Expense;

import Split.Split;

import java.util.List;
import User.User;

public class Expense {
    String expenseName;
    User paidBy;
    double expenseAmount;
    List<Split> splits;
    ExpenseSplitType expenseSplitType;

    public Expense(String expenseName, User user, double expenseAmount, List<Split> splits, ExpenseSplitType expenseSplitType) {
        this.expenseName = expenseName;
        this.paidBy = user;
        this.expenseAmount = expenseAmount;
        this.splits = splits;
        this.expenseSplitType = expenseSplitType;
    }
}
