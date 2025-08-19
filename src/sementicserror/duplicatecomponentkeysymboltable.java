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
        sb.append("symbol table duplicate semantics error : \n");
        sb.append("------------------------\n");
        sb.append(String.format("%-20s | %-10s\n", "name :", "value:"));
        sb.append("------------------------\n");

        for (String key : componentcontain.keySet()) {
            sb.append(String.format("%-20s | %-10s\n", key, componentcontain.get(key)));
        }

        return sb.toString();
    }
    }
