package Split;

import java.util.List;

public interface IExpenseSplit {
    public Boolean validSplit(List<Split> splits, double totalAmount);
}
