package AST.Nodes;

import java.util.ArrayList;
import java.util.List;

public class VoidTagNode extends HtmlNode {
    private String name;
    private List<ArtSelfTagAttribute> attributes;

    public VoidTagNode(String name, List<ArtSelfTagAttribute> attributes) {
        this.name = name;
        this.attributes = attributes != null ? attributes : new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<ArtSelfTagAttribute> getAttributes() {
        return attributes;
    }

    @Override
    public String toString() {
        return "VoidTagNode{" +
                "name='" + name + '\'' +
                ", attributes=" + attributes +
                '}';
    }

}
