package Cost;

public class CostRus extends Cost {

    public CostRus(double cost) {
        super(cost);
    }

    public double getCostInCurrency() {
        return cost * courseRus;
    }
}