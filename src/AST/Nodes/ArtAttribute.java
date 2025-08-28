package AST.Nodes;

import java.util.List;

public class ArtAttribute extends HtmlAttribute {
    private List<String> values;

    public ArtAttribute(List<String> values) {
        this.values = values;
    }

    public List<String> getValues() {
        return values;
    }

    @Override
    public String toString() {
        return "ArtAttribute{ routerLink='/ " + String.join(" ", values) + " ' }";
    }


    @Override
    public String getname() {
        return "a";
    }


    @Override
    public String getvalue() {
        return values.toString();
    }

    @Override
    public String code() {

        String hrefValue = "/" + String.join("/", values).replaceAll("//", "/");
        return " href=\"" + hrefValue + "\"";
    }


}
