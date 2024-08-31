package Split;

import java.util.List;

public class PercentageExpenseSplit implements  IExpenseSplit {
    @Override
    public Boolean validSplit(List<Split> splitList, double totalAmountOwe) {
        return true;
    }
}
