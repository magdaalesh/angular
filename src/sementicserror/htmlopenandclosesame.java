package sementicserror;

import symboletable.symboletable;

public class htmlopenandclosesame {
    public symboletable symbole ;
    public htmlopenandclosesame(){
        symbole=new symboletable();
    }
    public void  add(String type,String value , String Name , int line){
        symbole.addRow(type , value , Name ,line);

    }
    public Boolean checkhtmlendandstartname(String tagstaname , String tagendname){

        return tagstaname.equals(tagendname);
    }
    @Override
    public String toString() {
        return symbole.toString();
    }
}
