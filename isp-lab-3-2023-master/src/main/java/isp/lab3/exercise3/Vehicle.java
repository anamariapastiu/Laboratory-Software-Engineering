package isp.lab3.exercise3;

import java.util.Objects;

public class Vehicle {
    private String model;
    private String type;
    private int speed;
    private char fuelType;
    static int numberOfVehicles = 0;

    public static int getNumberOfVehicles() {
        return numberOfVehicles;

    }

    public Vehicle(String model, String type, int speed, char fuelType) {
        this.model = model;
        this.type = type;
        this.speed = speed;
        this.fuelType = fuelType;
        numberOfVehicles++;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setFuelType(char fuelType) {
        this.fuelType = fuelType;
    }

    public char getFuelType() {
        return fuelType;
    }

    public void setSpeed(int Speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", speed=" + speed +
                ", fuelType=" + fuelType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return getSpeed() == vehicle.getSpeed() && getFuelType() == vehicle.getFuelType() && Objects.equals(getModel(), vehicle.getModel()) && Objects.equals(getType(), vehicle.getType());
    }


    public static void main(String[] args) {
        Vehicle truck = new Vehicle("Scania", "HeavyCars", 100, 'D');
        Vehicle Dodge = new Vehicle("Challenger", "SportCar", 300, 'B');
        truck.setModel("Iveco");
        Dodge.setSpeed(500);
        int l = Dodge.getSpeed();
        System.out.println(l);
        if (truck.equals(Dodge)) {
            System.out.println("They are equals");
        } else System.out.println("They are not equals");
        System.out.println(Vehicle.numberOfVehicles);
        Dodge.toString();
            }
}

