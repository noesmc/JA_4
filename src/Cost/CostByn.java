package Cost;

import java.util.Scanner;

public class CostByn extends CostAmount implements Cost{
    public double cost;
    public double courseUsd;
    public double getCost() {
        return cost * courseUsd;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCourseUsd() {
        return courseUsd;
    }

    public void setCourseUsd(double courseUsd) {
        Scanner scanner = new Scanner(System.in);
        scanner.next();
        this.courseUsd = courseUsd;
    }
}
