import java.rmi.*;
import java.rmi.registry.*;
public class SearchServer
{
    public static void main(String args[])
    {
        try
        {
            // Create an object of the interface
            // implementation class
            Adder obj = new AdderRemote();
            // rmiregistry within the server JVM with
            // port number 1900
            LocateRegistry.createRegistry(1900);
            // Binds the remote object by the name
            Naming.rebind("rmi://localhost:1900"+
                    "/AADIL",obj);
        }
        catch(Exception ae)
        {
            System.out.println(ae);
        }
    }
}