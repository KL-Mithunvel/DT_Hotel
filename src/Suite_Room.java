public class Suite_Room extends Room implements Buyable{
    public Suite_Room(){
        super();
        add_furniture(new Furniture(FurnitureType.Chair));
        applianceList.add(new Refrigerator(123,"klm","1234567890"));
    }

    @Override
    public double get_price() {
        return 5003;
    }
    public String get_SKU(){
        return "vbnm";
    }
}
