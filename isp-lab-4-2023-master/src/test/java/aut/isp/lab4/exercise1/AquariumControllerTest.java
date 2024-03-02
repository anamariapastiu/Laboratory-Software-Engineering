package aut.isp.lab4.exercise1;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class AquariumControllerTest{
@Test
    public void currentTimeTest(){
    AquariumController aqua=new AquariumController("Hammershark","strong",21.03f);
     assertEquals(21.03f, aqua.getCurrentTime(),0.0);
     aqua.setCurrentTime(15.04f);
    assertEquals(15.04f, aqua.getCurrentTime(),0.0);


}

}