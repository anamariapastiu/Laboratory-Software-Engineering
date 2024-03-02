package isp.lab10.exercise1;

import java.util.ArrayList;

public class ATC {
    Aircraft aircraft;
    private ArrayList<Aircraft> aircraftlist= new ArrayList<>();
    public void addAircraft(String id){
        Aircraft airc=new Aircraft(id);
       aircraftlist.add(airc);
        System.out.println("Aircraft with id " + id + " added");
    }

    public void sendCommand(String id, AtcCommand command){
        System.out.println("Aircraft with id " + id + " received command " + command);
    }

    public void showAircrafts(){
        System.out.println("Display aircrfats.");
        for(String i:aircraftlist)
            System.out.println(i);
    }
}

class AtcCommand {
    String command;

    public AtcCommand(String command) {
        this.command = command;
    }

    @Override
    public String toString() {
        return "AtcCommand{" +
                "command='" + command + '\'' +
                '}';
    }
}
