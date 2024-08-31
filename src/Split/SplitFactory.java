package Split;

import Expense.ExpenseSplitType;

public class SplitFactory {
    public static IExpenseSplit getExpenseSplit(ExpenseSplitType type) {
        IExpenseSplit split = null;
        switch (type) {
            case ExpenseSplitType.EQUAL -> split = new EqualExpenseSplit();
            case ExpenseSplitType.UNEQUAL -> split = new UnequalExpenseSplit();
            default -> split = new PercentageExpenseSplit();
        }
        return split;
    }
}
