package AST.Nodes;

import java.util.List;

public class ClassNode extends Node {
    private String className;
    private List<String> implementsList;
    private List<ClassBodyEntry> body;

    public ClassNode(String className, List<String> implementsList, List<ClassBodyEntry> body) {
        this.className = className;
        this.implementsList = implementsList;
        this.body = body;
    }

    // ✅ أضف هذا التابع
    public void addBodyEntry(ClassBodyEntry entry) {
        body.add(entry);
    }

    public String getClassName() {
        return className;
    }

    public List<String> getImplementsList() {
        return implementsList;
    }

    public List<ClassBodyEntry> getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "ClassNode{" +
                "className='" + className + '\'' +
                ", implements=" + implementsList +
                ", body=" + body +
                '}';
    }
}
