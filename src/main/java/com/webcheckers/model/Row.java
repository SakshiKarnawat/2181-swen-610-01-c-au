package com.webcheckers.model;

import java.util.List;

public class Row {
    private int row;
    private List<Piece> pieces;

    public Row(List<Piece> rowList, int row) {
        this.pieces = rowList;
        this.row = row;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(List<Piece> pieces) {
        this.pieces = pieces;
    }
}
