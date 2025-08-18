package sementicserror;

import java.util.HashMap;

public class importslivalueinitbefor {

    public HashMap<String , Boolean> importlist =  new HashMap<>();
    public void addto (String listofimpoert ){
      importlist.put(listofimpoert,true);
    }
    public boolean check (String listofimports){

    return importlist.containsKey(listofimports) ;

    }
    @Override
    public String toString() {
        if (importlist.isEmpty()) {
            return "empty import list symbol table !";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("symbol table imports semantics error : \n");
        sb.append("------------------------\n");
        sb.append(String.format("%-20s | %-10s\n", "imports :", "init before:"));
        sb.append("------------------------\n");

        for (String key : importlist.keySet()) {
            sb.append(String.format("%-20s | %-10s\n", key, importlist.get(key)));
        }

        return sb.toString();
    }
}
