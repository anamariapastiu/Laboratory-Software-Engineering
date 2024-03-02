package isp.lab10.exercise1;

import java.util.ArrayList;

public class Aircraft implements Runnable {
    private String id;
    private int altitude;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public Aircraft(String id) {
        this.id = id;
    }


    public void recieveAtcCommand(AtcCommand command){
if(command instanceof TakeOffCommand){
    //TakeOffCommand t =(TakeOffCommand) command;

}

    }
        public void start(){
        Thread t=new Thread();
        t.start();
        }
    @Override
    public void run() {


    }
}
