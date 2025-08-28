package AST.Nodes;


public class InterfaceNode extends  Node{


    private String interfaceName;
    private interfacescontent properties;

    public InterfaceNode(String interfaceName, interfacescontent properties) {
        this.interfaceName = interfaceName;
        this.properties = properties;}

    public InterfaceNode(String interfaceName) {
        this.interfaceName = interfaceName;
        this.properties = null;
    }

    public InterfaceNode() {
        this.interfaceName = null;
        this.properties = null;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public interfacescontent getProperties() {
        return properties;
    }

    public void setProperties(interfacescontent properties) {
        this.properties = properties;
    }


    @Override
    public String toString() {
        return "InterfaceNode{" +
                "interfaceName='" + interfaceName + '\'' +
                ", properties=" + properties +
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
