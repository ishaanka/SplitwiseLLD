package Split;

import java.util.List;

public class EqualExpenseSplit implements IExpenseSplit {
    @Override
    public Boolean validSplit(List<Split> splitList, double totalAmountOwe) {
        double total = 0.0;
        for (Split split : splitList) {
            total += split.getAmountOwe();
        }
        return total == totalAmountOwe;
    }
}
