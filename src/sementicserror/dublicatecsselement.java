package sementicserror;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class dublicatecsselement {

public HashMap<String , HashSet<String>> duplicatecsselement = new HashMap<>();
public int line ;

public boolean addandcheckduplicate(String elementname , String csselement ,int  line  ){
    duplicatecsselement.putIfAbsent(elementname, new HashSet<>());
    HashSet<String> attrs = duplicatecsselement.get(elementname);
  if (attrs.add(csselement)){
      this.line=line;
      return  false;
  }
return true;

}

public void  closetag (String  elementname){
    duplicatecsselement.remove(elementname);
}
    @Override
    public String toString() {
        if (duplicatecsselement.isEmpty()) {
            return "No CSS element entries.";
        }

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-5s | %-20s | %-30s | %-5s\n", "ID", "Element", "Attributes", "Line"));
        sb.append("-------------------------------------------------------------------\n");

        int id = 1;
        for (Map.Entry<String, HashSet<String>> entry : duplicatecsselement.entrySet()) {
            String elementName = entry.getKey();
            HashSet<String> attrs = entry.getValue();

            StringBuilder attrList = new StringBuilder();
            for (String attr : attrs) {
                if (attrList.length() > 0) attrList.append(", ");
                attrList.append(attr);
            }

            sb.append(String.format("%-5d | %-20s | %-30s | %-5d\n",
                    id++,
                    elementName,
                    attrList.toString(),
                    line)); }

        return sb.toString();
    }

}
