package Cost;

public class CostEuro implements Cost{

    public double cost;
    public double courseEuro;
    public double courseUsd;

    public double getCost() {
        return cost * ( courseUsd / courseEuro);
    }
}
