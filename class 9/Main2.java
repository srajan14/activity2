interface vehical{
    void changegear(int a);
    void speedup(int a);
    void applybreaks(int a);
}
class bicycle implements vehical{
    int speed;
    int gear;
    @Override
    public void changegear(int newgear){
        gear=newgear;
    }
    @Override
    public void speedup(int increment){
        speed=speed+increment;
    }
    @Override
    public void applybreaks(int decrement){
        speed=speed-decrement;
    }
    public void printstates(){
        System.out.println("speed "+speed+" gear "+gear);
    }
}

class car implements vehical{
    int speed;
    int gear;
    @Override
    public void changegear(int newgear){
        gear=newgear;
    }
    @Override
    public void speedup(int increment){
        speed=speed+increment;
    }
    @Override
    public void applybreaks(int decrement){
        speed=speed-decrement;
    }
    public void printstates(){
        System.out.println("speed "+speed+" gear "+gear);
    }
}
public class Main2 {
    public static void main(String[] args) {
        bicycle a=new bicycle();
        a.changegear(2);
        a.speedup(25);
        a.applybreaks(2);
        System.out.println("bicycle present state");
        a.printstates();
        car b=new car();
        b.changegear(5);
        b.speedup(100);
        b.applybreaks(5);
        System.out.println("car present state");
        b.printstates();
    }
}
