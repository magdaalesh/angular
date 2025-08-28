package AST.Nodes;

import java.util.ArrayList;
import java.util.List;

public class ObjectDefinetionNode extends Node {
    private String name;
    private String type;
    private boolean isArray;
    private List<ContenttNode> contentList = new ArrayList<>();

    public ObjectDefinetionNode(String name, String type, boolean isArray) {
        this.name = name;
        this.type = type;
        this.isArray = isArray;
    }

    public void addContent(ContenttNode content) {
        contentList.add(content);
    }

    @Override
    public String toString() {
        return "ObjectDefinetionNode{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", isArray=" + isArray +
                ", contentList=" + contentList +
                '}';
    }

    @Override
    public String codegenerate() {
        StringBuilder js = new StringBuilder();

        if (isArray) {

            js.append("const ").append(name).append(" = [\n");
            for (int i = 0; i < contentList.size(); i++) {
                ContenttNode content = contentList.get(i);
                js.append("  ").append(content.codegenerate());
                if (i < contentList.size() - 1) js.append(",");
                js.append("\n");
            }
            js.append("];\n");
        } else {

            js.append("const ").append(name).append(" = {\n");
            for (int i = 0; i < contentList.size(); i++) {
                ContenttNode content = contentList.get(i);
                js.append("  ").append(content.codegenerate());
                if (i < contentList.size() - 1) js.append(",");
                js.append("\n");
            }
            js.append("};\n");
        }

        return js.toString();
    }


}
