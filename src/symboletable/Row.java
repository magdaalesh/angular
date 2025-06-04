package symboletable;

public class Row {
private  String type ;
private String value;
private String Name ;
private  int line ;
private  String massage;
public Row (String type,String value , String Name , int line ){
    this.Name=Name ;
    this.type=type;
    this.value=value;
this.line = line;

}
    public Row ( String Name , int line ){
        this.Name=Name ;

        this.line = line;

    }


    public int getLine() {
        return line;
    }

    public String getMassage() {
        return massage;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
