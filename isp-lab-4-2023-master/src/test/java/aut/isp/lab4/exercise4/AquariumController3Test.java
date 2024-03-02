package aut.isp.lab4.exercise4;

import junit.framework.TestCase;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class AquariumController3Test extends TestCase {

    public void testGetLightTime() {
        AquariumController3 aqua=new AquariumController3();
        aqua.setHourWhenLightsWillBeON(14.00f);
        aqua.setCurrentTime(16.30f);
        float expected=0;
        float actual=aqua.getLightTime();
        Assert.assertEquals(expected,actual,0);

    }
}