package server;

import java.util.HashMap;
import java.util.Map;

public class PlayerManager {
    private Map<String, Player> players;

    public PlayerManager() {
        players = new HashMap<>();
    }

    public void addPlayer(String playerId, Player player) {
        players.put(playerId, player);
    }

    public void removePlayer(String playerId) {
        players.remove(playerId);
    }

    public Player getPlayer(String playerId) {
        return players.get(playerId);
    }

    public Map<String, Player> getAllPlayers() {
        return players;
    }
}