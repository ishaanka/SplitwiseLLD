package Balance;

public class Balance {
    double amountOwe;
    double amountGetBack;

    public Balance(double amountOwe, double amountGetBack) {
        this.amountOwe = amountOwe;
        this.amountGetBack = amountGetBack;
    }

    public double getAmountOwe() {
        return amountOwe;
    }
    public double getAmountGetBack() {
        return amountGetBack;
    }
}
