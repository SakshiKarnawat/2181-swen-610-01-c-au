package com.webcheckers.model;

public class Piece {
    private boolean space;
    private boolean king;
    private int row;
    private int col;
    private String color;

    public Piece(int row, int col, String color) {
        this.row = row;
        this.col = col;
        this.color = color;
    }

    public Piece(int row, int col) {
        this.row = row;
        this.col = col;
        this.space = true;
    }

    public boolean isSpace() {
        return space;
    }

    public void setSpace(boolean space) {
        this.space = space;
    }

    public boolean isKing() {
        return king;
    }

    public void setKing(boolean king) {
        this.king = king;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
