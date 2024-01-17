public class teepattern {
    public  static void main(String[] main){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            for(int k=0;k<n-i-1;k++){
                System.out.print("");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("*");
            }
            for(int k=0;k<i+1;k++){
                System.out.print("");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                System.out.print("");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
