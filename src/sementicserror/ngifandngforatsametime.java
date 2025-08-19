package sementicserror;

import AST.Nodes.HtmlAttribute;
import symboletable.Row;

import java.util.ArrayList;
import java.util.List;

public class ngifandngforatsametime {

   public  List <Row> symbole ;

    public ngifandngforatsametime(){ symbole = new ArrayList<>();}

    public void  add(String value , String Name , int line){
        Row row= new Row(null,value,Name , line);
        symbole.add(row);

    }
    public boolean checkngifandngfor(List<HtmlAttribute> attributes) {
        boolean hasNgIf = false;
        boolean hasNgFor = false;

        for (HtmlAttribute attr : attributes) {
            String attrName = attr.toString().split("\\{")[0];
            if (attrName.equals("NgForAttribute")) hasNgFor = true;
            if (attrName.equals("NgIfAttribute")) hasNgIf = true;
        }

        return hasNgIf && hasNgFor;
    }

    @Override
    public String toString() {
        if (symbole == null || symbole.isEmpty()) {
            return "No attributes recorded.";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("ngfor ngif in same element semantics error symbol table :\n");

        sb.append(String.format("%-5s | %-15s | %-15s | %-15s \n",
                "ID", "Name", "Value", "Line"));
        sb.append("---------------------------------------------------------------\n");

        int id = 1;
        for (Row row : symbole) {
            sb.append(String.format("%-5d | %-15s  | %-15s | %-6d\n",
                    id++,
                    row.getName() != null ? row.getName() : "null",

                    row.getValue() != null ? row.getValue() : "null",
                    row.getLine()));
        }

        return sb.toString();
    }

}
