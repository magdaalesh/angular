package AST.Nodes;

import java.util.List;

public class ImportNode extends Node {
    private List<String> importList;
    private String importPath;

    public ImportNode(List<String> importList, String importPath) {
        this.importList = importList;
        this.importPath = importPath;
    }

    public ImportNode() {
        this.importList = null;
        this.importPath = null;
    }

    public ImportNode(List<String> importList) {
        this.importList = importList;
    }

    public ImportNode(String importPath) {
        this.importPath = importPath;
    }

    public List<String> getImportList() {
        return importList;
    }

    public void setImportList(List<String> importList) {
        this.importList = importList;
    }

    public String getImportPath() {
        return importPath;
    }

    public void setImportPath(String importPath) {
        this.importPath = importPath;
    }

    @Override
    public String toString() {
        return "ImportNode{" +
                "importList=" + importList +
                ", importPath='" + importPath + '\'' +
                '}';
    }

    @Override
    public String codegenerate() {
        StringBuilder sb = new StringBuilder();
        if (importList != null && !importList.isEmpty()) {
            sb.append("import { ").append(String.join(", ", importList)).append(" }");
        } else {
            sb.append("import ");
        }
        if (importPath != null && !importPath.isEmpty()) {
            sb.append(" from '").append(importPath).append("'");
        }
        sb.append(";");
        return sb.toString();
    }
}
