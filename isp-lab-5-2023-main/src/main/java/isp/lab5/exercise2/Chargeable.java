package isp.lab5.exercise2;

/**
 * @author Radu Miron
 */
public interface Chargeable {
     Laptop laptop = null;
     SmartPhone phone = null;
     SmartWatch watch= null;

    void charge(int duration);

    void getBatteryLevel();
}
