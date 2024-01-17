class qa1{
    public void s(){
        System.out.println("PARENT CLASS");
    }
}
class qa2 extends qa1{
    public void s(){
        System.out.println("CHILD CLASS");
    }
}
public class qASSIGNMENT1 {
    public static void main (String[] args){
        qa1 q1=new qa2();
        q1.s();
        qa2 q2= new qa2();
        q2.s();
    }

}
