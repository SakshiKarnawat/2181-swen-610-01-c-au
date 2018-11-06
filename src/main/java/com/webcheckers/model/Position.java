package com.webcheckers.model;


import java.util.Objects;

public class Position {
    private int row; // The row index of this position.
    private int cell; // The cell (column) index of this position.

    // Constructor
    public Position(int row,int cell){
        this.row = row;
        this.cell = cell;
    }

    public int getRow() {
        return this.row;
    }

    public int getCell() {
        return this.cell;
    }

    /**
     * check if two positions are the same
     * @param position
     * @return boolean value indicates whether the two positions are the same
     */
    @Override
    public boolean equals(Object position){
        if(position == this) return true;
        if(!(position instanceof Position)) return false;
        final Position that = (Position) position;
        return this.row == that.row && this.cell == that.cell;
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.row,this.cell);
    }

}
