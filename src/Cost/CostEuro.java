package Cost;

public class CostEuro extends Cost {

    public CostEuro(double cost) {
        super(cost);
    }

    public double getCostInCurrency() {
        return cost * (courseUsd / courseEuro);
    }
}