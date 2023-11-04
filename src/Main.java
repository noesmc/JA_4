import Cost.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CostByn costByn = new CostByn();
        CostEuro costEuro = new CostEuro();
        CostRus costRus = new CostRus();

        Car skoda = new Car("Skoda",
                "Octavia",
                "A5 scout",
                2012,
                "Universal",
                "Gasoline",
                1800);

        Car bmw = new Car("Audi",
                "Octavia",
                "A5 scout",
                2012,
                "Universal",
                "Gasoline",
                1800);

        Car audi = new Car("Bmw",
                "Octavia",
                "A5 scout",
                2012,
                "Universal",
                "Gasoline",
                1800);

        String str;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.printf("""
                    Choose the car's brand: %s, %s or %s. To exit press "Enter"
                    """, skoda.getBrand(), audi.getBrand(), bmw.getBrand());
            str = scanner.nextLine();
            switch (str) {
                case "Skoda":
                    skoda.getInfo();
                    printCost(costByn, costEuro, costRus);
                    break;
                case ("Bwm"):
                    bmw.getInfo();
                    printCost(costByn, costEuro, costRus);
                    break;
                case "Audi":
                    audi.getInfo();
                    printCost(costByn, costEuro, costRus);
                    break;
            }
        } while (!str.isEmpty());
    }

    public static void printCost(Cost costByn, Cost costEuro, Cost costRus) {

        System.out.printf("""
                Cost in BYN: %f,
                Cost in EURO: %f,
                Cost in RUS: %f
                """, costByn.getCostInCurrency(), costEuro.getCostInCurrency(), costRus.getCostInCurrency());
    }
}