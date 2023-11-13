import Car.Car;
import Cost.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CostByn costByn = new CostByn();
        CostEuro costEuro = new CostEuro();
        CostRus costRus = new CostRus();

        Car skoda = new Car("Skoda",
            "Octavia",
            "A5 scout",
            2012,
            "Universal",
            "Gasoline",
            1800,
            15000);

        Car bmw = new Car("Audi",
            "Octavia",
            "A5 scout",
            2012,
            "Universal",
            "Gasoline",
            1800,
            10000);

        Car audi = new Car("Bmw",
            "Octavia",
            "A5 scout",
            2012,
            "Universal",
            "Gasoline",
            1800,
            15000);

        do {
            System.out.printf("""
                    Choose the car's brand: %s, %s or %s. To exit press "Enter"
                    """, skoda.getBrand(), audi.getBrand(), bmw.getBrand());
            switch (scanner.nextLine()) {
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
        } while (!scanner.nextLine().isEmpty());
    }

    public static void printCost(Cost costByn, Cost costEuro, Cost costRus) {

        System.out.printf("""
                Cost in BYN: %f,
                Cost in EURO: %f,
                Cost in RUS: %f
                """, costByn.getCostInCurrency(), costEuro.getCostInCurrency(), costRus.getCostInCurrency());
    }
}