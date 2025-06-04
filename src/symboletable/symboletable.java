package symboletable;

import java.util.ArrayList;
import java.util.List;

public class symboletable {
    private List<Row> rowList;

    public List<Row> getRowlist() {
        return rowList;
    }

    public void setRowlist(List<Row> rowlist) {
        this.rowList = rowlist;
    }
    public symboletable(){rowList= new ArrayList<>();}
    public void addRow(String type,String value , String Name , int line ){
        Row row= new Row(type,value,Name , line);
        rowList.add(row);
    }

    @Override
    public String toString() {
        if (rowList == null || rowList.isEmpty()) {
            return "Symbol Table is empty";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Symbol Table:\n");
        sb.append(String.format("%-5s | %-15s | %-15s | %-15s | %-6s\n",  // عدل عرض الأعمدة
                "ID", "Name", "Type", "Value", "Line"));
        sb.append("-----------------------------------------------------------------\n");

        int id = 1;
        for (Row row : rowList) {
            sb.append(String.format("%-5d | %-15s | %-15s | %-15s | %-6d\n",  // عدل محارف التنسيق
                    id++,
                    row.getName() != null ? row.getName() : "null",
                    row.getType() != null ? row.getType() : "null",
                    row.getValue() != null ? row.getValue() : "null",
                    row.getLine()));  // تأكد أن getLine() يرجع int
        }

        return sb.toString();
    }
}
