package Car;

import Cost.Cost;
import Cost.CostByn;

public class Car {
    private String brand;
    private String model;
    private String modelRange;
    private int yearOfCreating;
    private String form;
    private String fuelType;
    private float volumeInCm3;
    private float cost;

    public String getBrand() {
        return brand;
    }

    public Car(String brand, String model, String modelRange, int yearOfCreating, String form, String fuelType,
               float volumeInCm3, float cost) {
        this.brand = brand;
        this.model = model;
        this.modelRange = modelRange;
        this.yearOfCreating = yearOfCreating;
        this.form = form;
        this.fuelType = fuelType;
        this.volumeInCm3 = volumeInCm3;
        this.cost = cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void getInfo() {
        System.out.printf("""
                Brand: %s,
                Model: %s,
                Model range: %s
                Year of creating: %d,
                Form: %s,
                Type of fuel: %s,
                Volume in dm3: %f,
                Cost %f
                """, brand, model, modelRange, yearOfCreating, form, fuelType, volumeInCm3 / 1000f, cost);
    }
}