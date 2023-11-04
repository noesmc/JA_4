package Cost;

import java.util.Scanner;

public class CostAmount {
    public static double costAmount;
    Scanner scanner = new Scanner(System.in);

    public static void enterAmount() {
        Scanner scanner = new Scanner(System.in);
        costAmount = Double.parseDouble(scanner.next());
    }
}
