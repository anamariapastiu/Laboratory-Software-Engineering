package aut.isp.lab4.exercise2;

public class FishFeeder {
    private String manufacturer;
    private String model;
    private static int meals;

    public FishFeeder(String manufacturer, String model, int meals) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.meals = meals;
    }
    public void setMeals(){
        this.meals=14;
    }
    private void Feed(){
        setMeals();
        while(this.meals!=0){
            this.meals-=1;
        }
        System.out.println(meals);
    }
    public void privateFeedCaller(){
        Feed();
    }
    @Override
    public String toString() {
        return "FishFeeder{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", meals=" + meals +
                '}';
    }
    private void Fill(){
        setMeals();
        if(this.meals>0){
            Feed();
        }
        else if (this.meals==0){
            System.out.println("There's no meals left, refill");
            this.meals=14;
        }







    }
    public static void main(String[] args) {
        FishFeeder man=new FishFeeder("Nemo","littleOnes",14);
        man.Feed();
    }
}


