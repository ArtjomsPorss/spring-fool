package me.art.p.turn.phase;

public enum TurnPhases {
    ATTACK, /* happens in the beginning of turn */
    DEFEND, /* attempt of defending player to beat the opponent cards */
    ADD, /* when defending player defended, the attacker and other players can add more cards to attack */
    PASS, /* players that attack or add decide not to add more cards */
    SCOOP, /* defending player is not able to defend and decides to scoop the cards he is attacked with */
    DRAW; /* draw cards to replenish hand at the end of turn */
}
