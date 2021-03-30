package me.art.p.turn.phase;

public class GenericTurnPhase implements IPhase {
    TurnPhases phase;

    public GenericTurnPhase(TurnPhases phase) {
        this.phase = phase;
    }
}
