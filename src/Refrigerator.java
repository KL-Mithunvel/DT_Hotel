import java.util.ArrayList;

public class Refrigerator extends Appliance{
    ArrayList <String> contents =new ArrayList<String>();

    public Refrigerator(double pow, String M, String s_no) {
        super(pow, M, s_no);
        turn_on();

    }
    @Override
    public void turn_off() {
       //Refrigerator should not be turned off
        // not turn off just "stand by"
        System.out.println("Cant turn off Refrigerator.");
    }
}