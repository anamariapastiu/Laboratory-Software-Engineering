package isp.lab8.airways;
import java.util.List;
public interface IRouteManager {

    void createRoute(List<Waypoint> waypoints, String routeName) throws RouteManagerException;
    List<Waypoint> getRoute(String routeName)throws RouteManagerException;
    double getRouteDistance(String routeName)throws RouteManagerException;
    void deleteRoute(String routeName)throws RouteManagerException;

}

