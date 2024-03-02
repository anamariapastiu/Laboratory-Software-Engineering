package isp.lab3.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void testToString() {
        Vehicle ford=new Vehicle("Mustang","GoodOne",260,'D');
        System.out.println(ford.toString());
    }
}