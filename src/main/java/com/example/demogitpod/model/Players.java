package com.example.demogitpod.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

@Data
public class Players implements Serializable {
    private List<Player> players;

    public Players() {
        this.players = new ArrayList<>();
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
