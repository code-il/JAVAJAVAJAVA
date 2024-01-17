class vehicle{
    int seating_capacity;
    int fare(int f){
        return seating_capacity*100;
    }
}
class bus extends vehicle{
    int seating_capacity;
    void capacity(int c){
        seating_capacity=c;
    }
    double fare(){
        double tot=seating_capacity*100;
        return (tot+(0.1*tot));
    }
}
public class busbikesq {
}
