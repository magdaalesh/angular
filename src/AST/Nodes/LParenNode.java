package AST.Nodes;

import java.util.ArrayList;
import java.util.List;

public class LParenNode extends Value {
    private String name;          // اسم الدالة (ID الأول)
    private List<Node> arguments; // كل argument لازم يكون Node

    public LParenNode(String name, List<Node> arguments) {
        this.name = name;
        this.arguments = arguments != null ? arguments : new ArrayList<>();
    }

    public String getName() { return name; }
    public List<Node> getArguments() { return arguments; }

    @Override
    public String toString() {
        return "LParenNode{" +
                "name='" + name + '\'' +
                ", arguments=" + arguments +
                '}';
    }

    /**
     * @return
     */
    @Override
    protected String codegenerateInternal() {
        // تحويل navigate تلقائيًا
        if (name.contains("navigate")) {
            String page = "";
            String param = null;

            if (!arguments.isEmpty()) {
                // نفترض أول argument هو اسم الصفحة
                Node firstArg = arguments.get(0);
                page = firstArg.codegenerate().replaceAll("[\\[\\]'\" ]", "");

                // ثاني argument لو موجود
                if (arguments.size() > 1) {
                    Node secondArg = arguments.get(1);
                    param = secondArg.codegenerate();
                }
            }

            StringBuilder sb = new StringBuilder();
            sb.append("window.location.href = \"/").append(page).append(".html\"");
            if (param != null && !param.isEmpty()) {
                sb.append(" + \"?id=\" + encodeURIComponent(").append(param).append(")");
            }
            sb.append(";");
            return sb.toString();
        }


        StringBuilder sb = new StringBuilder();
        sb.append(name).append("(");
        for (int i = 0; i < arguments.size(); i++) {
            sb.append(arguments.get(i).codegenerate());
            if (i < arguments.size() - 1) sb.append(", ");
        }
        sb.append(");");
        return sb.toString();
    }

    @Override
    public Expr asExpr() {
        List<Expr> args = new ArrayList<>();
        args.add(new ValueExpr(null, new IdValue(List.of(getName()))));

        for (Node arg : arguments) {
            args.add(arg.asExpr());
        }

        return new CallExprNode(name, args);
    }



}
