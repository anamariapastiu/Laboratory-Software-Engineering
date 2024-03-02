package isp.lab6.exercise2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Registry {
    private static String VIN;
    private String licensePlate;
    private String make;
    private String model;
    private double year;
    private Set<String> vehicles= new HashSet<>();

    public Registry() {
    }

    public Registry(String VIN, String licensePlate, String make, String model, double year) {
        this.VIN = VIN;
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public static String getVIN() {
        return VIN;
    }

    public static void setVIN(String VIN) {
        Registry.VIN = VIN;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getYear() {
        return year;
    }

    public void setYear(double year) {
        this.year = year;
    }

    public Set<String> getVehicles() {
        return vehicles;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Registry)) return false;
        Registry registry = (Registry) o;
        return Double.compare(registry.getYear(), getYear()) == 0 && Objects.equals(getLicensePlate(), registry.getLicensePlate()) && Objects.equals(getMake(), registry.getMake()) && Objects.equals(getModel(), registry.getModel()) && Objects.equals(vehicles, registry.vehicles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLicensePlate(), getMake(), getModel(), getYear(), vehicles);
    }
}
