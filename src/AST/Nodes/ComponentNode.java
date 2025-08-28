package AST.Nodes;

public class ComponentNode extends Node {
    private ComponentMetadata metadata;

    public ComponentNode(ComponentMetadata metadata) {
        this.metadata = metadata;
    }
    public ComponentNode(){
        this.metadata=null;
    }

    public ComponentMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(ComponentMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public String toString() {
        return "ComponentNode{" +
                "metadata=" + metadata +
                '}';
    }

    /**
     * @return
     */
    @Override
    public String codegenerate() {
        return "";
    }
}

