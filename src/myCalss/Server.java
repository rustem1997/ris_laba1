package myCalss;

import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {
    public static final String UNIQUE_BINDING_NAME = "server.calculate";

    public static void main(String[] args) throws RemoteException, AlreadyBoundException, InterruptedException {

        final Hello server = new Hello();
        final Registry registry = LocateRegistry.createRegistry(2733);

        Remote stub = UnicastRemoteObject.exportObject(server, 0);
        registry.bind(UNIQUE_BINDING_NAME, stub);

        System.out.println("Ожидание клиента...");
        Thread.sleep(Integer.MAX_VALUE);

    }
}
