package AST.Nodes;

public class injectableDefination extends Node {
    private String id;
    private String providin;

    public injectableDefination(String id, String providin) {
        this.id = id;
        this.providin = providin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProvidin() {
        return providin;
    }

    public void setProvidin(String providin) {
        this.providin = providin;
    }

    @Override
    public String toString() {
        return "InjectableDefination{" +
                "id='" + id + '\'' +
                ", providin='" + providin + '\'' +
                '}';
    }

    @Override
    public String codegenerate() {
        StringBuilder sb = new StringBuilder();
        sb.append("provide ").append(id);
        if (providin != null && !providin.isEmpty()) {
            sb.append(" => ").append(providin);
        }
        sb.append(";");
        return sb.toString();
    }
}
