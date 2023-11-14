import Car.Car;
import Cost.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cost = scanner.nextDouble();
        CostByn costByn = new CostByn(cost);
        CostEuro costEuro = new CostEuro(cost);
        CostRus costRus = new CostRus(cost);
        Car skoda = new Car("Skoda",
            "Octavia",
            "A5 scout",
            2012,
            "Universal",
            "Gasoline",
            1800);
        Car bmw = new Car("Audi",
            "A6",
            "C6",
            2006,
            "Sedan",
            "Gasoline",
            2000);
        Car audi = new Car("Bmw",
            "5",
            "E39",
            2000,
            "Universal",
            "Gasoline",
            3000);

        System.out.printf("""
            Choose the car's brand: %s, %s or %s. To exit press "Enter"
            """, skoda.getBrand(), audi.getBrand(), bmw.getBrand());
        switch (scanner.next()) {
            case "Skoda":
                skoda.getInfo();
                printCost(costByn, costEuro, costRus);
                break;
            case "Bwm":
                bmw.getInfo();
                printCost(costByn, costEuro, costRus);
                break;
            case "Audi":
                audi.getInfo();
                printCost(costByn, costEuro, costRus);
                break;
        }
    }

    public static void printCost(Cost costByn, Cost costEuro, Cost costRus) {
        System.out.printf("""
            Cost in BYN: %f,
            Cost in EURO: %f,
            Cost in RUS: %f
            """, costByn.getCostInCurrency(), costEuro.getCostInCurrency(), costRus.getCostInCurrency());
    }
}