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
    @Override
    public String codegenerate() {
        StringBuilder sb = new StringBuilder();


        sb.append("class ").append(className);

        if (implementsList != null && !implementsList.isEmpty()) {
            sb.append(" /* implements ");
            for (int i = 0; i < implementsList.size(); i++) {
                sb.append(implementsList.get(i));
                if (i < implementsList.size() - 1) sb.append(", ");
            }
            sb.append(" */");
        }

        sb.append(" {\n");

                if (body != null) {
            for (ClassBodyEntry entry : body) {
                String entryCode = entry.codegenerate();
                if (entryCode != null ) {

                    String[] lines = entryCode.split("\n");
                    for (String line : lines) {
                        sb.append("  ").append(line).append("\n");
                    }
                }
            }
        }

        sb.append("}");

        return sb.toString();
    }

}
