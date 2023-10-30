import Cost.*;

public class Main {

    public static void main(String[] args) {
        CostByn costByn = new CostByn();
        costByn.cost = 500;
        costByn.setCourseUsd();
        printCost(costByn);

        CostEuro costEuro= new CostEuro();
        costEuro.cost = 500;
        costEuro.courseUsd = 3;
        costEuro.courseEuro = 3.33;
        printCost(costEuro);

        CostRus costRus= new CostRus();
        costRus.cost = 500;
        costRus.courseRus = 97.77;
        printCost(costRus);
    }
        public static void printCost(Cost cost) {
            System.out.println(cost.getCost());
        }
}