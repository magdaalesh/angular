package sementicserror;

import symboletable.symboletable;

public class duplicateselectorsymboltable {

     public symboletable symbole;

    public duplicateselectorsymboltable() {
        symbole = new symboletable();
    }

    public void add(String name ,int line){
        symbole.addRow(name, name, name, line);

    }

  public boolean  checksinglehtmltamplet(String name , int line ){

      if (symbole.getRowlist().stream().anyMatch(row -> row.getName().equals(name))) {
          return false;
      }

      return  true;
    }
    public boolean checkAndAdd(String selector, int line) {

        if (symbole.getRowlist().stream().anyMatch(row -> row.getName().equals(selector))) {
            return false;
        }



        return true;
    }

    @Override
    public String toString() {
        return symbole.toString();
    }
}
