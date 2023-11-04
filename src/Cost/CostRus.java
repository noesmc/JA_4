package Cost;

public class CostRus extends Cost {

    public double getCostInCurrency() {
        return costInUsd * courseRus;
    }
}
