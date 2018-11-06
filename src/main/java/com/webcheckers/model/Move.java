package com.webcheckers.model;

public class Move {

    private Position start; // The starting position of the move.
    private Position end; // The ending position of the move.

    // Constructor
    public Move(Position start, Position end){
        this.setStart(start);
        this.setEnd(end);
    }

    public Position getStart() {
        return start;
    }

    public void setStart(Position start) {
        this.start = start;
    }

    public Position getEnd() {
        return end;
    }

    public void setEnd(Position end) {
        this.end = end;
    }

}
