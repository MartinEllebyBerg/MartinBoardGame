public class Adventure {

    private Map gameMap;
    private Player gamePlayer;

    public Adventure() {
        gameMap = new Map();
        gamePlayer = new Player(gameMap.getFirstRoom());
    }

    public Player getGamePlayer() {
        return gamePlayer;
    }

    public Map getGameMap() {
        return gameMap;
    }
}
