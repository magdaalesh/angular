package AST.Nodes;

import java.util.ArrayList;
import java.util.List;

public class ImageAttribute extends HtmlAttribute {
    private String name;
    private List<String> ids;

    public ImageAttribute(String name, List<String> ids) {
        this.name = name;
        this.ids = ids != null ? ids : new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<String> getIds() {
        return ids;
    }

    @Override
    public String getname() {
        return name;
    }

    @Override
    public String getvalue() {
        return String.join(".", ids);
    }

    @Override
    public String code() {
        String value = String.join("/", ids);
        return name + "=\"" + value + "\"";
    }

    @Override
    public String toString() {
        return "ImageAttribute{" +
                "name='" + name + '\'' +
                ", ids=" + ids +
                '}';
    }
}
