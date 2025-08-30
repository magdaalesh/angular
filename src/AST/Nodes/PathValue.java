package AST.Nodes;

public class PathValue extends Value {
    private String path;

    public PathValue(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return "PathValue{" + "path='" + path + '\'' + '}';
    }

    @Override
    public String codegenerateInternal() {
        return path != null ? path : "";
    }
}
