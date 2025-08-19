package AST.Nodes;

import java.util.List;

public class ImageAttribute extends HtmlAttribute {
    private final List<String> path; // مثال: ["user", "profileImage"]

    public ImageAttribute(List<String> path) {
        this.path = path;
    }

    public List<String> getPath() {
        return path;
    }

    @Override
    public String toString() {
        return "ImageAttribute{ "+ path + '}';
    }

    @Override
    public String getname() {
        return path.toString();
    }
}
