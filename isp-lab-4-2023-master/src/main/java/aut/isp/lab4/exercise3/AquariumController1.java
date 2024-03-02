package aut.isp.lab4.exercise3;
public class AquariumController1{
     private FishFeeder2 feeder;
     private String manufacturer;
     private String model;
     private static float currentTime;
     private static float feedingTime;
     public static void setFeedingTime(float feed) {
         feedingTime = feed;
     }
     public static void setCurrentTime(float cTime) {
         currentTime = cTime;
         if(currentTime==feedingTime){
             FishFeeder2.feed();
         }
     }



     @Override
     public String toString() {
         return "AquariumController{" +
                 "feeder=" + feeder +
                 ", manufacturer='" + manufacturer + '\'' +
                 ", model='" + model + '\'' +
                 ", currentTime=" + currentTime +
                 ", feedingTime=" + feedingTime +
                 '}';
     }
 }
 class FishFeeder2 {
     private String manufacturer;
     private String model;
     private static int meals;





    public static void fillUp(){
        meals=14;
     }
    public static int getMeals() {
        return meals;
    }
public static void feed(){
        getMeals();
         if(meals>0){
        meals-=1;
        System.out.println(meals);
    }
    if(meals==0){
        System.out.println("No more food, refill");
        fillUp();
    }

}
    public static void main(String[] args) {
    FishFeeder2 feeder=new FishFeeder2();

    FishFeeder2.fillUp();
    AquariumController1.setFeedingTime(14.50f);
    AquariumController1.setCurrentTime(14.50f);


    }
}
