package sementicserror;


import symboletable.Row;

import java.util.ArrayList;
import java.util.List;

public class htmlopenandclosesame {
    private List<Row> rowList;
    public htmlopenandclosesame(){
        rowList= new ArrayList<>();
    }
    public void  add(String type,String value , String Name , int line){
        Row row= new Row(type,value,Name , line);
        rowList.add(row);
    }
    public Boolean checkhtmlendandstartname(String tagstaname , String tagendname){

        return tagstaname.equals(tagendname);
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
                    row.getLine()));
        }

        return sb.toString();
    }
}
