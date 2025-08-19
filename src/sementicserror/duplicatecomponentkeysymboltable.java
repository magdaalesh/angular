package sementicserror;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class duplicatecomponentkeysymboltable {
public HashMap<String , List<String>> componentcontain = new HashMap<>();
public void addto (String componententry , String value ){
    componentcontain.putIfAbsent(componententry, new ArrayList<>());
    componentcontain.get(componententry).add(value);

}
public boolean checkifduplicate(String componententry){
    return componentcontain.containsKey(componententry) && componentcontain.get(componententry).size() >1;
}
    @Override
    public String toString() {
        if (componentcontain.isEmpty()) {
            return "empty duplicate component entry symbol table !";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("symbol table component key duplicate semantics error : \n");
        sb.append("------------------------\n");
        sb.append(String.format("%-20s | %-30s\n", "name :", "value:"));
        sb.append("------------------------\n");

        for (String key : componentcontain.keySet()) {
            List<String> valuesList = componentcontain.get(key);
            List<String> displayValues = new ArrayList<>();

            for (String val : valuesList) {
                // لو القيمة تمثل Template/Node نطبع ملخص فقط
                if (val.startsWith("HtmlTemplate") || val.startsWith("ElementNode")) {
                    displayValues.add(val.split("\\{")[0] + "{...}");
                } else {
                    displayValues.add(val);
                }
            }

            String values = String.join(", ", displayValues);
            sb.append(String.format("%-20s | %-30s\n", key, values));
        }

        return sb.toString();
    }

}
