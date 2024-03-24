public class Lamp extends Appliance implements Buyable{
    public Lamp(double pow,String M,String s_no){
        super(pow,M,s_no);
    }

    @Override
    public double get_price() {
        return 1;
    }

    @Override
    public String get_SKU() {
        return null;
    }
}
