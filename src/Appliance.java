public class Appliance {
    double rated_power;
    String model;
    String serial_no;
    private Boolean current_state=false;
    //false is off

    public void turn_on(){
        current_state= true;
    }
    public void turn_off(){
        current_state=false;
        System.out.println("Just Off");
    }
    public Appliance(double pow,String M,String s_no){
        rated_power=pow;
        model=M;
        serial_no=s_no;

    }
}



