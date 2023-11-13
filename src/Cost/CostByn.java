package Cost;

public class CostByn extends Cost {

    public double getCostInCurrency() {
        return cost * courseUsd;
    }
}