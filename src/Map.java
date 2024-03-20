public class Map {

    //Attribute
    private Room firstRoom;

    //Konstruktør
    public Map() {
        createMap();
    }

    public void createMap() {
        Room room1 = new Room("Boldskabet", "Rummet med alle fjerene");
        Room room2 = new Room("Den Flyvende Fodboldbane", "Trampoliner og mål i væggene");
        Room room3 = new Room("Svømmebassin Surprise", "Opblæsbar vandrutsjebane og boldpool");
        Room room4 = new Room("Den Springende Skatepark", "Skateboard på elastik og fjedre");
        Room room5 = new Room("Basketball Baskerville", "Hoppende kurve og gulvtrampolin");
        Room room6 = new Room("Fjedrende Fitnesscenter", "Hoppende boldskaller og heliumvægte");
        Room room7 = new Room("Gakkede Golf Green", "Skiftende minigolfbane og viljefyldte bolde");
        Room room8 = new Room("Løbebanen Lystigt", "Sløjfeløbebånd og komplimentære pulsmålere");
        Room room9 = new Room("Den Vilde Volleyball Volley", "Strandvolleyball i måneformet sandkasse");
        firstRoom = room1;
    }



//Getter metode
    public Room getFirstRoom() {
        return firstRoom;
    }



}
