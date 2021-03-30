package me.art.p;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class PlayerService {


    public List<Player> getAllPlayers() {
        return Arrays.asList(
                new Player(UUID.randomUUID().toString()),
                new Player(UUID.randomUUID().toString()),
                new Player(UUID.randomUUID().toString())
        );
    }
}
