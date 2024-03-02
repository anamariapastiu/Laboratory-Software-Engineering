package isp.lab7.safehome;

import java.util.HashMap;

public class DoorLockController implements ControllerInterface{
    private HashMap<AccesKey, Tenant> validAccess =new HashMap<>();
    private Door door;
    private int countAttempts;
    public DoorLockController(Door door){
        this.door=door;
    }
    @Override
    public DoorStatus enterPin(String pin) throws Exception {
        AccesKey key=new AccesKey(pin);
        if(validAccess.containsKey(key)){
            if(door.getStatus()==DoorStatus.OPEN)
                door.lockDoor();
            else
                door.unlockDoor();
        }
        return door.getStatus();
    }

    @Override
    public void addTenant(String pin, String name) throws Exception {
        // trebuie verificat daca un tenant cu acelasi nume exista in sistem

        validAccess.put(new AccesKey(pin),new Tenant(name));
    }

    @Override
    public void removeTenant(String name) throws Exception {

    }
    public static void main(String[] args){
        Door door1=new Door();
        String stat= String.valueOf(door1.getStatus());
        DoorLockController controller=new DoorLockController(door1);

        try{
            controller.addTenant("1243","Test");
            controller.enterPin("1243");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
