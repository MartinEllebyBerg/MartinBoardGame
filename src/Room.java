import java.util.ArrayList;

public class Room {

    //Attributes
    private String roomName;
    private String roomDescription;
    private Room up, down, left, right;
    private ArrayList<Item> itemList = new ArrayList<Item>();

    //Konstruktør
    public Room(String roomName, String roomDescription) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
    }

    //Metode til at tilføje items til rummene
    public void addItemToARoom(Item item) {
        itemList.add(item);
    }

    //Getter metoder
    public String getRoomName() {
        return roomName;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public Room getUp() {
        return up;
    }

    public Room getDown() {
        return down;
    }

    public Room getLeft() {
        return left;
    }

    public Room getRight() {
        return right;
    }

    //Setter metoder
    public void setUp(Room up) {
        this.up = up;
    }

    public void setDown(Room down) {
        this.down = down;
    }

    public void setLeft(Room left) {
        this.left = left;
    }

    public void setRight(Room right) {
        this.right = right;
    }
}
