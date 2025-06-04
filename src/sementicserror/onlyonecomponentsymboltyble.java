package sementicserror;

import symboletable.symboletable;

public class onlyonecomponentsymboltyble {

symboletable symbole ;
  private int count=1;

    public onlyonecomponentsymboltyble(){
        symbole = new symboletable();
    }

     public void  add(String type,String value , String Name , int line){
      symbole.addRow(type , value , Name ,line);

     }
    public boolean checkSingleComponent( ) {
       if(count >1){
           return false;
       }
       count++;
       return true;

    }

    public void setSymbole(symboletable symbole) {
        this.symbole = symbole;
    }

    public symboletable getSymbole() {
        return symbole;
    }

    @Override
    public String toString() {
        return symbole.toString();
    }
}
