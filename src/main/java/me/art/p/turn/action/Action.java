package me.art.p.turn.action;

import lombok.Data;
import me.art.p.Player;

@Data
public class Action {
    Player player;
    ActionType actionType;
    String card;
}
