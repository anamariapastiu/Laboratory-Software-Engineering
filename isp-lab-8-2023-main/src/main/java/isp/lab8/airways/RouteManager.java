package isp.lab8.airways;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class RouteManager implements IRouteManager {
    @Override
    public void createRoute(List<Waypoint> waypoints, String routeName) throws RouteManagerException {

    }

    @Override
    public List<Waypoint> getRoute(String routeName) throws RouteManagerException {
        return null;
    }

    @Override
    public double getRouteDistance(String routeName) throws RouteManagerException {
        List<Waypoint> list=getRoute(routeName);
        double distance=0;
        Collections.sort(list);
        for(Waypoint w:list){
            int i=w.getIndex();
         double a=  w.getLatitude();
         double b=  w.getLongitude();
         i=i+1;
         w.setIndex(i);
         double c=w.getLatitude();
         double d=w.getLongitude();
          distance=distance+WaypointDistanceCalculator.calculateDistance(a,b,c,d);

            }


        return distance;

    }

    @Override
    public void deleteRoute(String routeName) throws RouteManagerException {
        List<Waypoint> list=getRoute(routeName);

    }

    public static void main(String[] args) {
  //   RouteManager rm = new RouteManager();
    //   Waypoint w1 =new Waypoint();
      // Waypoint w2 =new Waypoint();
        //Waypoint w3 =new Waypoint();
 //       Waypoint w4 =new Waypoint();
   //     ArrayList<Waypoint> list = new ArrayList<>();
     //   list.add(w1);list.add(w2);list.add(w3);list.add(w4);
       // try {
 //           rm.createRoute(list,"firstRoute");
   //     } catch (RouteManagerException e) {
     //       throw new RuntimeException(e);
       // }

    }
}