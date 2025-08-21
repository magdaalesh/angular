package AST.Nodes;

import java.util.List;

public class VariableContent extends Content {
    private List<String> path;
    public VariableContent(List<String> path) {
        this.path = path;
    }

    public List<String> getPath() {
        return path;
    }

    @Override
    public String toString() {
        return "VariableContent{" +
                "path=" + path +
                '}';
    }
}
