package com.technogise.test;

public class Cell {
    //need to be static
    //private String rowNames = "ABCDEFGH";

    int row;
    char column;

    Cell(int row, char column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public void setColumn(char column) {
        this.column = column;
    }

        /*public void setRowByName(Character rowName) {
            if(rowNames.indexOf(rowName) != 1) {
                this.row = rowNames.indexOf(rowName);
            }
        }

        public Character getRowName() {
            return rowNames.charAt(row);
        }*/
}
