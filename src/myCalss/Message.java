package myCalss;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Message extends Remote {
 String Hello(String string) throws RemoteException;

}
