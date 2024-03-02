package isp.lab7.safehome;

public class Door {
    private DoorStatus status;
    public void lockDoor(){
      System.out.println("The door is locked");
    }
    public void unlockDoor(){
    System.out.println("The door is unlocked");
    }

    public DoorStatus getStatus() {
        return status;
    }
}
