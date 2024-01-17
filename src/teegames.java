class b implements teegame{
    @Override
    public String game_type() {
        return "Boardgame";
    }
}
public class teegames {
    public static void main(String[] args){
        b ob=new b();
        ob.game_type();
    }
}
