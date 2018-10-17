package com.webcheckers.model;

import java.util.List;

/**
* Attaches a usernmae, color, and pieces to a player.
*/

public class Player {
    private String name;
    private String color;
    private List<Piece> pieces;

    public Player(User user) {
        this.name = user.getUserName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(List<Piece> pieces) {
        this.pieces = pieces;
    }
}
