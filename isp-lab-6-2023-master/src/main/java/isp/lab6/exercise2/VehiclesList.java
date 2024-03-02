package isp.lab6.exercise2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class VehiclesList {

    private Set<String> vehicles= new HashSet<>();


    public void addVehicle(){
        Scanner car=new Scanner(System.in);
        vehicles.add(String.valueOf(car));
        System.out.println(vehicles);
    }
    public void removeVehicle(String VIN){
        if(vehicles.contains(VIN))
            vehicles.remove(Registry.getVIN());
    }
    public void checkVehicle(String VIN){
        if(vehicles.contains(VIN))
            System.out.println("it exists");
    }
    public void displayVehicles() {
        for (String vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}
