package myCalss;

import java.rmi.Remote;
import java.rmi.RemoteException;

public class Hello implements Message {


    @Override
    public String Hello(String string) throws RemoteException {
        return ""+string;
    }
}
