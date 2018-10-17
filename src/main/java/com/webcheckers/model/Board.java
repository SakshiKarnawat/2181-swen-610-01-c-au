package com.webcheckers.model;

import java.util.ArrayList;
import java.util.List;

/**  Creates the 8x8 game board and places the pieces in the starting locations.
* the board creates pieces based on Rows. Rows to be phased out in a future version.
*/


public class Board {

    private List<Row> board;

    public Board() {
        board = new ArrayList<>();
        for (int row = 0; row < 8; row++) {
            List<Piece> rowList = new ArrayList<>();
            if (row < 3) {
                for (int col = 0; col < 8; col++) {
                    if ((row & 1) == 0) {
                        if ((col & 1) != 0) {
                            Piece piece = new Piece(row, col, "RED");
                            rowList.add(piece);
                        } else {
                            // Empty space
                            Piece piece = new Piece(row, col);
                            rowList.add(piece);
                        }
                    } else {
                        if ((col & 1) == 0) {
                            Piece piece = new Piece(row, col, "RED");
                            rowList.add(piece);
                        } else {
                            // Empty space
                            Piece piece = new Piece(row, col);
                            rowList.add(piece);
                        }
                    }

                }
            } else if (row < 5) {
                for (int col = 0; col < 8; col++) {
                    Piece piece = new Piece(row, col);
                    rowList.add(piece);
                }
            } else {
                for (int col = 0; col < 8; col++) {
                    if ( (row & 1) != 0 ) {
                        if ((col & 1) == 0) {
                            Piece piece = new Piece(row, col, "WHITE");
                            rowList.add(piece);
                        } else {
                            Piece piece = new Piece(row, col);
                            rowList.add(piece);
                        }
                    } else {
                        if ((col & 1) != 0) {
                            Piece piece = new Piece(row, col, "WHITE");
                            rowList.add(piece);
                        } else {
                            Piece piece = new Piece(row, col);
                            rowList.add(piece);
                        }
                    }

                }
            }
            board.add(new Row(rowList, row));
        }

    }

    public List<Row> getBoard() {
        return board;
    }

    public void setBoard(List<Row> board) {
        this.board = board;
    }
}
