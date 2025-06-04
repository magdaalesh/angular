package sementicserror;

import symboletable.symboletable;
import symboletable.Row;

public class variableSymbolTable {
    private symboletable symbole;

    public variableSymbolTable() {
        symbole = new symboletable();
    }

    public boolean checkAndAdd(String propertyName, int line) {
        for (Row row : symbole.getRowlist()) {
            if (row.getName().equals(propertyName)) {
                return false;
            }
        }

        symbole.addRow("Variable", propertyName, propertyName, line); // نضيف المتغير
        return true;
    }

    @Override
    public String toString() {
        return symbole.toString(); // طباعة جدول الرموز
    }
}
