package aut.isp.lab4.exercise1;

public class AquariumController {
    public static Object setCurrentTime;
    private String manufacturer;
        private String model;
        private float currentTime;

    public AquariumController(String manufacturer, String model, float currentTime) {
        this.manufacturer = manufacturer;
        this.model=model;
        this.currentTime=currentTime;
    }
    public void setCurrentTime(float currentTime){
        this.currentTime=currentTime;
    }

    public float getCurrentTime() {
        return currentTime;
    }

    @Override
    public String toString() {
        return "AquariumController{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", currentTime=" + currentTime +
                '}';
    }
}
