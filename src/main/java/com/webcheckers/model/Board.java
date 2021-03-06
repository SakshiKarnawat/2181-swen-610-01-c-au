package com.webcheckers.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

/**  Creates the 8x8 game board and places the pieces in the starting locations.
* the board creates pieces based on Rows. Rows to be phased out in a future version.
*/


public class Board implements Iterable<Row>{

    public List<Row> board;
    public Board() {
        board = new ArrayList<>();
        for (int row = 0; row < 8; row++) {
            List<Piece> rowList = new ArrayList<>();
            if (row < 3) {
                for (int cell = 0; cell < 8; cell++) {
                    if ((row & 1) == 0) {
                        if ((cell & 1) != 0) {
                            Piece piece = new Piece(row, cell, "RED");
                            rowList.add(piece);
                        } else {
                            // Empty space
                            Piece piece = new Piece(row, cell);
                            rowList.add(piece);
                        }
                    } else {
                        if ((cell & 1) == 0) {
                            Piece piece = new Piece(row, cell, "RED");
                            rowList.add(piece);
                        } else {
                            // Empty space
                            Piece piece = new Piece(row, cell);
                            rowList.add(piece);
                        }
                    }

                }
            } else if (row < 5) {
                for (int cell = 0; cell < 8; cell++) {
                    Piece piece = new Piece(row, cell);
                    rowList.add(piece);
                }
            } else {
                for (int cell = 0; cell < 8; cell++) {
                    if ((row & 1) != 0) {
                        if ((cell & 1) == 0) {
                            Piece piece = new Piece(row, cell, "WHITE");
                            rowList.add(piece);
                        } else {
                            Piece piece = new Piece(row, cell);
                            rowList.add(piece);
                        }
                    } else {
                        if ((cell & 1) != 0) {
                            Piece piece = new Piece(row, cell, "WHITE");
                            rowList.add(piece);
                        } else {
                            Piece piece = new Piece(row, cell);
                            rowList.add(piece);
                        }
                    }

                }
            }
        }

    }
    public Iterator<Row> iterator() {
        return board.iterator();
    }

    public List<Row> getBoard() {
        return board;
    }

    public void setBoard(List<Row> board) {
        this.board = board;
    }

    @Override
    public Spliterator<Row> spliterator() {
        return null;
    }
}
