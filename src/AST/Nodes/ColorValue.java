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
        return "ColorValue{" +
                "colorCode='" + colorCode + '\'' +
                '}';
    }
}
