package isp.lab7.safehome;

import java.util.Objects;

public class AccesKey {
    private String pin;

    public void setPin(String pin) {
        this.pin = pin;
    }

    public AccesKey(String pin) {
        this.pin = pin;
    }

    public String getPin() {
        return pin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccesKey)) return false;
        AccesKey accesKey = (AccesKey) o;
        return Objects.equals(pin, accesKey.pin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pin);
    }
}
