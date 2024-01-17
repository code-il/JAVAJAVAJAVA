class box{
    double width;
    double height;
    double depth;
    box(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    double volume(){
        return width*height*depth;
    }
}
public class constructor1{
    public static void main(String[] args){
        box mybox1=new box(10,20,30);
        box mybox2=new box(1,5,8);
        double vol1=mybox1.volume();
        System.out.println(vol1);
        double vol2=mybox2.volume();
        System.out.println(vol2);
    }
}