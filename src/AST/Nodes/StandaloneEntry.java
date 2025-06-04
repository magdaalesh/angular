package AST.Nodes;

public class StandaloneEntry extends MetadataEntry {
    private boolean standalone;

    public StandaloneEntry(boolean standalone) {
        this.standalone = standalone;
    }

    public boolean isStandalone() {
        return standalone;
    }

    public void setStandalone(boolean standalone) {
        this.standalone = standalone;
    }

    @Override
    public String toString() {
        return "StandaloneEntry{standalone=" + standalone + "}";
    }
}

