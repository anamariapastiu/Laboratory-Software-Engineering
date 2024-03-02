package isp.lab3.exercise5;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendingMachineTest {

    @Test
    void displayProducts() {
    VendingMachine machine=new VendingMachine(new String[] {"Pepsi","SevenDays","Bounty"},0);
    String[] expected={"0Pepsi" + "1SevenDays"+"3Bounty"};
    String[] actual=VendingMachine.displayProducts(VendingMachine machine);
    assertEquals(expected,actual);

    }

    @Test
    void insertCoins() {
        VendingMachine machine=new VendingMachine(new String[] {"Pepsi","SevenDays","Bounty"},0);
        int expected=5;
        int actual=VendingMachine.insertCoins(5);
        assertEquals(expected,actual);
    }

    @Test
    void selectProduct() {
        VendingMachine machine=new VendingMachine(new String[] {"Pepsi","SevenDays","Bounty"},0);
        String expected= "SevenDays";
        String actual=VendingMachine.selectProduct(1);
        assertEquals(expected,actual);


    }

}