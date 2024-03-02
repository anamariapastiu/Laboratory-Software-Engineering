package aut.isp.lab4.exercise3;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FishFeeder2Test {

    public void testFeed() {
        FishFeeder2 man=new FishFeeder2();
        man.fillUp();
        man.feed();
        assertEquals(13f, man.getMeals(),0);
    }
}