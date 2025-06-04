package sementicserror;
import symboletable.symboletable;
public class dublicatecsselement {
    symboletable symbole;

    public dublicatecsselement() {
        symbole = new symboletable();
    }

    public boolean checkAndAddngif(String key, int line) {
        if (symbole.getRowlist().stream().anyMatch(row -> row.getName().equals(key))) {
            return false;
        }

        symbole.addRow("ngIf", key, key, line);
        return true;
    }
    public boolean checkAndAddclick(String elementKey, int line) {
        if (symbole.getRowlist().stream().anyMatch(row -> row.getName().equals(elementKey))) {
            return false;
        }
        symbole.addRow("click", elementKey, elementKey, line);
        return true;
    }

    @Override
    public String toString() {
        return symbole.toString();
    }
}
