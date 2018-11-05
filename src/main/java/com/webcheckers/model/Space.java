package com.webcheckers.model;

public class Space {

    private String color;
    private Piece piece;
    private int cellIdx;

    public Space(String _color, Piece _piece, int _cellIdx) {
        this.color = _color;
        this.piece = _piece;
        this.cellIdx = _cellIdx;
    }
}