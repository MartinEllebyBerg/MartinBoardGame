public class Room {

    //Attributes
    private String roomName;
    private String roomDescription;
    private Room up, down, left, right;

    //Konstruktør
    public Room(String roomName, String roomDescription) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
    }
}
