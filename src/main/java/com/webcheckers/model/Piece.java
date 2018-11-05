package com.webcheckers.model;

/**
* Determeines where a piece is located on the board, what team it is on, and whether or not it is a king
* 
*/

public class Piece {
    private boolean space;
    private boolean king;
    private int row;
    private int cell;
    private String color;

    public Piece(int row, int cell, String color) {
        this.row = row;
        this.cell = cell;
        this.color = color;
    }

    public Piece(int row, int cell) {
        this.row = row;
        this.cell = cell;
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

    public int getCell() {
        return cell;
    }

    public void setCell(int cell) {
        this.cell = cell;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
