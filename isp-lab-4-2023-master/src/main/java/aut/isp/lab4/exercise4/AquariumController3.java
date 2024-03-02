package aut.isp.lab4.exercise4;

import static java.lang.Math.abs;

public class AquariumController3{
private FishFeeder3 feeder3;
private String manufacturer;
private String model;
private static float currentTime;
private static float hour;
private static float feedingTime;
private static float lightTime;
private static int light;
    public static void setFeedingTime(float feed) {
        feedingTime = feed;
    }
    public static void setCurrentTime(float cTime) {
        currentTime = cTime;
        if(currentTime==feedingTime){
            FishFeeder3.feed();
        }
    }
    public static void setHourWhenLightsWillBeON(float hour){
        hour=hour;
        light=1;
    }
    public static float getLightTime() {
        lightTime=abs(currentTime-hour);
        if(lightTime<8.00f){
            light=1;
        }else{ light=0;}
        return light;
    }

        @Override
    public String toString() {
        return "AquariumController3{" +
                "feeder3=" + feeder3 +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", lightTime=" + lightTime +
                '}';
    }

    }

 class FishFeeder3 {
    private String manufacturer;
    private String model;
    private static int meals;
    public static void fillUp(){
        meals=14;
    }
    public static int getMeals() {
        return meals;
    }
    public static void feed() {
        getMeals();
        if (meals > 0) {
            meals -= 1;
            System.out.println(meals);
        }
        if (meals == 0) {
            System.out.println("No more food, refill");
            fillUp();
        }
    }
        public static void main(String[] args) {
        AquariumController3.setHourWhenLightsWillBeON(14.00f);
        AquariumController3.setCurrentTime(16.30f);
        AquariumController3.getLightTime();

    }
}
