package myCalss;


import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    public static final String UNIQUE_BINDING_NAME = "server.calculate";
    public static void main(String[] args) throws RemoteException, NotBoundException {

        final Registry registry = LocateRegistry.getRegistry(2733);

        Message calculator = (Message) registry.lookup(UNIQUE_BINDING_NAME);
        Scanner scanner = new Scanner(System.in);
        String buffer;
        String string ;
//        String a = string.replace("a", "");
        while (true) {
            System.out.println("Введите строка, это будет отправлено на сервер и возвращено им.");
            System.out.print("Введите строка..."+'\n');
            buffer = scanner.nextLine();
            if(buffer == null || buffer.matches("-?\\d+")){   // "[a-z][A-Z]"     "-?\\d+"

                System.out.println("Введите только строка...");
                continue;
            }else{
                string = buffer;
            }

            System.out.println("Сервер прислал ответ:" +string.replace("a","g"));

        }
    }
}

