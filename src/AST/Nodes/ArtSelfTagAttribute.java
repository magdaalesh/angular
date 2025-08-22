package AST.Nodes;

import java.util.ArrayList;
import java.util.List;

public class ArtSelfTagAttribute extends CssAttribute {
    private String name;
    private List<String> ids;

    public ArtSelfTagAttribute(String name, List<String> ids) {
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
    public String toString() {
        if (ids.isEmpty()) return name;
        return name + "=\"" + String.join(" ", ids) + "\"";
    }

    @Override
    public String getname() {
        return name;
    }

    @Override
    public String getvalue() {
        return String.join(" ", ids);
    }
}
