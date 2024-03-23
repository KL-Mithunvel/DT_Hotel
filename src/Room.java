import java.util.ArrayList;
public class Room {
    Furniture[] furnitureList =new Furniture[0];
    ArrayList<Appliance> applianceList = new ArrayList<Appliance>();

    public void add_furniture(Furniture f){
        int len=furnitureList.length;
        Furniture n_arr []=new Furniture[len+1];
        for (int i = 0; i < len; i++) {
            n_arr[i]=furnitureList[i];
        }n_arr[len]=f;
        furnitureList=n_arr;
    }
    public void countFurnitureType(FurnitureType ft){
        int count=0;
        int len=furnitureList.length;
        for (int i = 0; i < len; i++) {
            if (furnitureList[i].type==ft){
                count++;
            }
        }
        System.out.println("There is totally "+count+" "+ft+" in the room.");
    }

}

