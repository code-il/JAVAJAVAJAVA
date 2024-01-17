import java.rmi.*;//RMI PROGRAM
import java.rmi.registry.*;
public class MyServer{
    public static void main(String args[]){
        try{
            Adder stub=new AdderRemote();
            LocateRegistry.createRegistry(5000);
            Naming.rebind("rmi://localhost:5000/sonoo",stub);
        }catch(Exception e){System.out.println(e);}
    }
}