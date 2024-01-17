import java.util.Scanner;

public class teestr {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        str=sc.nextLine();
        String [] str2=str.split(" ");
        StringBuilder sb1=new StringBuilder();
        for(int i= str2.length-1;i>=0;i--){
            sb1.append(str2[i]+" ");
        }
        System.out.println("New String is:"+sb1);
        System.out.println("---------------------");
        String stra;
        System.out.println("Enter the dotted String:");
        stra = sc.nextLine();
        String[] str3 = stra.split("\\.");
        System.out.println(str3[1]);
        String sb2 = " ";
        for (int i = str3.length - 1; i >= 0; i--) {
            if (i == str3.length - 1) {
                sb2 = sb2 + str3[i];
            } else {
                sb2 = sb2 + "." + str3[i];
            }
        }
        System.out.println("String is:" + sb2);
        String strb;
        System.out.println("Enter the string:");
        strb=sc.nextLine();
        String str4="";
        for(int i=strb.length()-1;i>=0;i--){
            str4=str4+strb.charAt(i);
        }
        if(str4.equals(strb)){
            System.out.println("palindrome");
        }else{
            System.out.println("not");
        }
        String strc;
        String strd;
        System.out.println("enter first string:");
        strc=sc.nextLine();
        System.out.println("enter second string:");
        strd=sc.nextLine();
        String f1=strc.substring(2)+strc.substring(0,2);
        String b1=strc.substring(strc.length()-1)+strc.substring(0,strc.length()-1);
        if(f1.equalsIgnoreCase(strd)){
            System.out.println("EQUAL IN FORWARD");
        }else if(f1.equalsIgnoreCase(strd)){
            System.out.println("EQUAL IN BACKWARD");
        }else{
            System.out.println("NOT");
        }
    }
}
