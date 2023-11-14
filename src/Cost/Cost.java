package Cost;

public abstract class Cost implements Calculate {
    public double cost;
    public double courseUsd = 3.2;
    public double courseEuro = 3.33;
    public double courseRus = 97.77;

    public Cost(double cost) {
        this.cost = cost;
    }
}