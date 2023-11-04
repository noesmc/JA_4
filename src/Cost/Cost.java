package Cost;

public abstract class Cost {
    public double costInUsd = 500;
    public double courseUsd = 3.2;
    public double courseEuro = 3.33;
    public double courseRus = 97.77;

    public void setCostInUsd(double costInUsd) {
        this.costInUsd = costInUsd;
    }

    public abstract double getCostInCurrency();
}
