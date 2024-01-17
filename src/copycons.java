class rectangle{
    int length;
    int breadth;
    rectangle(int l,int b){
        length=l;
        breadth=b;
    }
    rectangle(rectangle obj){
        length=obj.length;
        breadth= obj.breadth;
    }
    int area(){
        return length*breadth;
    }
}
public class copycons {
    public static void main(String[] args){
        rectangle firstrect=new rectangle(100,200);
        rectangle copyrect=new rectangle(firstrect);
        System.out.println(firstrect.area());
        System.out.println(copyrect.area());
    }
}
