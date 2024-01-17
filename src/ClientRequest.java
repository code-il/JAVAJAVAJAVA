import java.rmi.*;
public class ClientRequest
{
    public static void main(String args[])
    {

        try {
        Adder stub = (Adder) Naming.lookup("rmi://localhost:1900" +
                "/AADIL");
        System.out.println("Addition answer: " + stub.add(40, 6));
        }
        catch(Exception ae)
        {
            System.out.println(ae);
        }
    }
}