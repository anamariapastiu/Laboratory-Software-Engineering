package isp.lab7.safehome;

public class TenantAlreadyExistsException extends Exception{

    public TenantAlreadyExistsException(String msg){
        super(msg);
    }
}
