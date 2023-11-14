package Cost;

public class CostByn extends Cost {

    public CostByn(double cost) {
        super(cost);
    }

    public double getCostInCurrency() {
        return cost * courseUsd;
    }
}