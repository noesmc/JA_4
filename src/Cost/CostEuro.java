package Cost;

public class CostEuro extends Cost {

    public double getCostInCurrency() {
        return cost * (courseUsd / courseEuro);
    }
}