public class Main {
    public static void main(String[] args) {
        Hotel novotel = new Hotel();
        Room r_1706= new Room();
        novotel.rooms.add(r_1706);
        Furniture chair1= new Furniture(FurnitureType.Chair);
        r_1706.add_furniture(chair1);
        Furniture chair2= new Furniture(FurnitureType.Chair);
        r_1706.add_furniture(chair2);
        Furniture table= new Furniture(FurnitureType.Table);
        r_1706.add_furniture(table);
        r_1706.countFurnitureType(FurnitureType.Chair);
        r_1706.countFurnitureType(FurnitureType.Bed);
        r_1706.applianceList.add(new Refrigerator(350,"LG 106","123456789"));
        Refrigerator rf1= new Refrigerator(1800,"whirlpool","9443352");
        r_1706.applianceList.add(rf1);
        for (int i = 0; i < r_1706.applianceList.size(); i++) {
            System.out.println(r_1706.applianceList.get(i).model);

        }
    }
}