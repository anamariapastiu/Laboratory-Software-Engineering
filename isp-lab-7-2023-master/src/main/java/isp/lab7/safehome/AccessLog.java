package isp.lab7.safehome;

import java.time.LocalDateTime;

public class AccessLog {
    private String TenantName;
    private LocalDateTime dateTime;
    private String operation;
    private DoorStatus doorStatus;
    private String errorMessage;

    public String getTenantName() {
        return TenantName;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getOperation() {
        return operation;
    }

    public DoorStatus getDoorStatus() {
        return doorStatus;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
