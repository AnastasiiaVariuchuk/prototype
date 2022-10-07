package one;

import java.util.ArrayList;

public class Column {
    private ArrayList<Integer> column = new ArrayList();

    public Column() {
    }

    public Column(ArrayList<Integer> column) {
        this.column = column;
    }

    public ArrayList<Integer> getColumn() {
        return column;
    }

    public void setColumn(ArrayList<Integer> column) {
        this.column = column;
    }
}
