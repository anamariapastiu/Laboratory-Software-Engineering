package isp.lab8.airways;

import java.io.Serializable;
import java.util.Objects;

/**
 * Example waypoint class which can be extended to be used in implementation of the exercise. Add constructor, getters, setters, etc.
 */
public class Waypoint implements Serializable,Comparable<Waypoint> {
    private int index;
    private String name;
    private double latitude;
    private double longitude;
    private int altitude;

    public int getIndex() {
        return index;
    }



    public Waypoint(int index, String name, double latitude, double longitude, int altitude) {
        this.index = index;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    @Override
    public String toString() {
        return "Waypoint{" +
                "index=" + index +
                ", name='" + name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", altitude=" + altitude +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Waypoint)) return false;
        Waypoint waypoint = (Waypoint) o;
        return getIndex() == waypoint.getIndex() && Double.compare(waypoint.getLatitude(), getLatitude()) == 0 && Double.compare(waypoint.getLongitude(), getLongitude()) == 0 && getAltitude() == waypoint.getAltitude() && Objects.equals(getName(), waypoint.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIndex(), getName(), getLatitude(), getLongitude(), getAltitude());
    }

    @Override
    public int compareTo(Waypoint o) {
        return index-o.index;
    }
}
