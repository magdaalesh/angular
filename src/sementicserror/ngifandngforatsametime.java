package sementicserror;

import AST.Nodes.HtmlAttribute;
import symboletable.symboletable;

import java.util.List;

public class ngifandngforatsametime {
   public  symboletable symbole ;
    boolean contantngfor=false , contentnfig= false;
    public ngifandngforatsametime(){ symbole = new symboletable();}

    public void  add(String type,String value , String Name , int line){
        symbole.addRow(type , value , Name ,line);

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
        return symbole.toString();
    }
}
