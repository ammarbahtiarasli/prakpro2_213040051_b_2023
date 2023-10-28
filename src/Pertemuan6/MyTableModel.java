package Pertemuan6;

import javax.swing.table.*;
import java.util.ArrayList;
import java.util.List;

public class MyTableModel extends AbstractTableModel {
    private String [] columnNames = {"Nama", "Jenis member"};
    private ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();

    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return data.size();
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        ArrayList<String> temp = data.get(row);
        return temp.get(col);
    }

    public boolean isCellEditable(int row, int col) {
        return false;
    }

    public void add(ArrayList<String> value) {
        data.add(value);
        fireTableRowsInserted(data.size()-1, data.size()-1);
    }
}
