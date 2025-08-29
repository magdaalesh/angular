package AST.Nodes;

public class ColorValue extends Value {
    private String colorCode;

    public ColorValue(String colorCode) {
        this.colorCode = colorCode;
    }

    public String getColorCode() {
        return colorCode;
    }

    @Override
    public String toString() {
        return colorCode;
    }

    // تنفيذ الطريقة الجديدة المطلوبة من Value
    @Override
    public String codegenerateInternal() {
        return "\"" + colorCode + "\""; // نضع اللون بين علامتي اقتباس
    }
}
