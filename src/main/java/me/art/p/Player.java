package me.art.p;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Player {
    @NonNull
    private String uuid;
    private IRepository repository;


    public boolean same(Player attacker) {
        return this.uuid.equals(attacker.uuid);
    }

    public boolean hasCard(String card) {
        return repository.hasCard(uuid, card);
    }
}
