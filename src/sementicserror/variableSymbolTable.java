package sementicserror;
import symboletable.symboletable;
import symboletable.Row;
public class variableSymbolTable {
    public symboletable symbole;
    public variableSymbolTable() {
        symbole = new symboletable();
    }

    public boolean checkAndAddv(String propertyName,String type, String val, int line) {
        for (Row row : symbole.getRowlist()) {
            if (row.getName().equals(propertyName)) {
                return false;
            }
        }

        symbole.addRow(type, propertyName, propertyName, line);
        return true;
    }

    @Override
    public String toString() {
        return symbole.toString();
    }
}
