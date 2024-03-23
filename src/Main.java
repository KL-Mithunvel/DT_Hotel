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


    }
}