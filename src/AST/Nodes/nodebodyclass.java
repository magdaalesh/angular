package AST.Nodes;

public abstract class nodebodyclass {
    // هيكلية الجسم العام لأي node داخلي
    @Override
    public abstract String toString();

    public abstract String codegenerate();
}
