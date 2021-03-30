package me.art.p.turn.phase;

import me.art.p.Player;
import me.art.p.turn.action.Action;
import me.art.p.turn.action.ActionType;

public class AttackPhase implements IPhase {
    private Player attacker;
    private Player defender;

    public AttackPhase(Player attacker, Player defender) {
        this.attacker = attacker;
        this.defender = defender;
    }

    public void performAction(Action action) {
        if(isAttacker(action.getPlayer())
                && action.getActionType() == ActionType.ATTACK
                && attacker.hasCard(action.getCard())) {
            /* 1. move card onto table from hand
            *  2. move phase to Defend */
            // has to be thread safe so that same player spamming same action doesn't create weird scenario
        } else {
            // fail the action
        }
    }

    private boolean isAttacker(Player player) {
        return this.attacker.same(player);
    }
}
