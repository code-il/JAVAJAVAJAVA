import java.net.*;
import java.io.*;
import java.util.Scanner;

class DCsocket2way{//SERVER
    public static void main(String args[])throws Exception{
        ServerSocket ss=new ServerSocket(3333);
        Socket s=ss.accept();
        DataInputStream din=new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String str="",str2="";
        while(!str.equalsIgnoreCase("stop")){
            str=din.readUTF();
            System.out.println("client says: "+str);
            if(str.equalsIgnoreCase("where does the sun rise from?")){
                str2="THE EAST";
                dout.writeUTF(str2);
            } else if (str.equalsIgnoreCase("what is the currency of india?")) {
                str2="INDIAN RUPEE";
                dout.writeUTF(str2);
            } else if (str.equalsIgnoreCase("hello") ||
                    str.equalsIgnoreCase("bonjour") ||
                    str.equalsIgnoreCase("hi") ||
                    str.equalsIgnoreCase("good morning") ) {
                str2="---HELLO THERE---\nI AM A CHATBOT FOR GENERAL KNOWLEDGE\nVERSION N046";
                dout.writeUTF(str2);
            }else if (str.equalsIgnoreCase("India’s space agency acronym?")) {
                str2="ISRO";
                dout.writeUTF(str2);
            } else if (str.equalsIgnoreCase("Monke sec")) {
                int i=0;
                Scanner sc=new Scanner(System.in);
                System.out.println("ENTER THE PASSWORD:");
                i=sc.nextInt();
                if(i==46515256){
                    System.out.println("THE MONKE NEVER SLEEPS");
                    str2="MONKE FOREVER";
                    dout.writeUTF(str2);
                }else{
                    System.out.println("YOU DIDN'T SEE ANYTHING");
                    str2="GOODBYE :<";
                    dout.writeUTF(str2);
                }
            } else if (str.equalsIgnoreCase("Which is the largest desert of Asia?")) {
                str2="GOBI DESERT";
                dout.writeUTF(str2);
            } else if (str.equalsIgnoreCase("What is the name of the longest river in the world?")) {
                str2="NILE";
                dout.writeUTF(str2);
            } else {
                str2="IS THAT IT?\nTYPE STOP TO STOP";
                dout.writeUTF(str2);
            }
            //str2=br.readLine();
            //dout.writeUTF(str2);
            dout.flush();//flushes to the output
        }
        din.close();
        s.close();
        ss.close();
    }}