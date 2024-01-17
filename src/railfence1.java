import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class railfence1 {
    String a,a1,a2,a3;
    int n;
    void input1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Plain Text:");
        a = sc.nextLine();
        a1=a.replaceAll(" ","").toLowerCase();
        System.out.println("enter key:");
        n=sc.nextInt();
        menu();
    }
    void encryption(){
        char[][] rail = new char[n][a1.length()];
        for (int i = 0; i < n; i++)
            Arrays.fill(rail[i], '\n');

        boolean dirDown = false;
        int row = 0, col = 0;

        for (int i = 0; i < a1.length(); i++) {
            if (row == 0 || row == n - 1)
                dirDown = !dirDown;
            rail[row][col++] = a1.charAt(i);
            if (dirDown)
                row++;
            else
                row--;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < a1.length(); j++)
                if (rail[i][j] != '\n')
                    result.append(rail[i][j]);
        a2=result.toString();
        System.out.println("ENCRYPTED TEXT:");
        System.out.println(a2);
        menu();
    }

    void decryption(){
        char[][] rail = new char[n][a2.length()];
        for (int i = 0; i < n; i++)
            Arrays.fill(rail[i], '\n');
        boolean dirDown = true;
        int row = 0, col = 0;
        for (int i = 0; i < a2.length(); i++) {
            if (row == 0)
                dirDown = true;
            if (row == n - 1)
                dirDown = false;
            rail[row][col++] = '*';
            if (dirDown)
                row++;
            else
                row--;
        }
        int index = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < a2.length(); j++)
                if (rail[i][j] == '*'
                        && index < a2.length())
                    rail[i][j] = a2.charAt(index++);

        StringBuilder result = new StringBuilder();

        row = 0;
        col = 0;
        for (int i = 0; i < a2.length(); i++) {
            if (row == 0)
                dirDown = true;
            if (row == n - 1)
                dirDown = false;
            if (rail[row][col] != '*')
                result.append(rail[row][col++]);
            if (dirDown)
                row++;
            else
                row--;
        }

        a3=result.toString();
        System.out.println("DECRYPTED TEXT:");
        System.out.println(a3);
        menu();
    }
    public void menu() {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("--:WELCOME TO RAILFENCE CIPHER:--");
        while (i == 0) {
            System.out.println("\n 1.INPUT \n 2.ENCRYPTION \n 3.DECRYPTION \n 4.EXIT");
            i = sc.nextInt();
            switch (i) {
                case 0:
                    break;
                case 1:
                    input1();
                    break;
                case 2:
                    encryption();
                    break;
                case 3:
                    decryption();
                    break;
                case 4:
                    i = 1;
                    break;
            }
        }
    }
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        railfence1 ob=new railfence1();
        ob.menu();
    }

}


