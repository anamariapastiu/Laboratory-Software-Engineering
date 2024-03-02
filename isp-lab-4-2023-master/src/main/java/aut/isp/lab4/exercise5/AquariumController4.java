package aut.isp.lab4.exercise5;



class FishFeeder4 {
    private String manufacturer;
    private String model;
    private static int meals;

    public static void fillUp() {
        meals = 14;
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
}
public class AquariumController4 {
     private FishFeeder4 feeder;
    private String manufacturer;
    private String model;
    private static float currentTime;
    private static float feedingTime;
    private static int temperature;
    public static void setFeedingTime(float feed) {
        feedingTime = feed;
    }
    public static void setCurrentTime(float cTime) {
        currentTime = cTime;
        if(currentTime==feedingTime){
            FishFeeder4.feed();
        }
    }

    public static void main(String[] args) {

    }
}
