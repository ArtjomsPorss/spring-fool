package me.art.p.turn;

import me.art.p.*;
import me.art.p.turn.phase.IPhase;
import me.art.p.turn.phase.GenericTurnPhase;
import me.art.p.turn.phase.TurnPhases;

import java.util.ArrayList;
import java.util.List;

public class Turn {
    PlayerService playerService = new PlayerService();

    public void setupTurn() {
        List<IPhase> turnPhases = new ArrayList<IPhase>();
        List<Player> players = playerService.getAllPlayers();
        turnPhases.add(new GenericTurnPhase(TurnPhases.ATTACK));
        turnPhases.add(new GenericTurnPhase(TurnPhases.DEFEND));
        turnPhases.add(new GenericTurnPhase(TurnPhases.ADD));
        turnPhases.add(new GenericTurnPhase(TurnPhases.DRAW));
    }
}
