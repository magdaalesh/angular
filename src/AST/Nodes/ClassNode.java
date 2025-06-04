package AST.Nodes;

import java.util.List;

public class ClassNode extends Node{
    private String className;
    private List<ClassBodyEntry> body;

    public ClassNode(String className, List<ClassBodyEntry> body) {
        this.className = className;
        this.body = body;
    }

    public String getClassName() {
        return className;
    }

    public List<ClassBodyEntry> getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "ClassNode{" +
                "className='" + className + '\'' +
                ", body=" + body +
                '}';
    }
}
