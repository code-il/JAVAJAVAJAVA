public class m2exception {
    public static void main(String[] args){
        try {
           String d= null;
           System.out.println(d.length());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }

}
