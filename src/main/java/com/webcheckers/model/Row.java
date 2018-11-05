package com.webcheckers.model;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

/**
* The board class contains rows which contain the pieces. \
* This class is needed by the UI and may be phased out in a future version.
*
*/

public class Row implements Iterable<Space>{
    private int row;
    private List<Space> spaces;

    public Row(List<Space> rowList, int row) {
        this.spaces = rowList;
        this.row = row;
    }
    public Iterator<Space> iterator() {
        return spaces.iterator();
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    @Override
    public Spliterator<Space> spliterator() {
        return null;
    }
}
