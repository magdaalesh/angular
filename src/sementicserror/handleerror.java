package sementicserror;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class handleerror {
    private static handleerror instance;
    private final List<String> errors = new ArrayList<>();
    private List<String> symboles = new ArrayList<>();
    private handleerror() {}

    public static handleerror getInstance() {
        if (instance == null) {
            instance = new handleerror();
        }
        return instance;
    }

    public void addError( String message, int line) {
        errors.add(String.format("[%s] Line : %s", message, line));
    }

    public void printSymboletable() {
        if (!symboles.isEmpty()) {
            System.out.println("\n===Symbole tables ===");
            symboles.forEach(System.out::println);
            System.out.println("===================\n");
        }
    }
    public void printerror() {
        if (!errors.isEmpty()) {
            System.out.println("\n=== error reports ===");
            errors.forEach(System.out::println);
            System.out.println("===================\n");
        }
    }
    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    public void generateErrorFile() {
        try (FileWriter writer = new FileWriter("src/errors.txt")) {
            writer.write("===== SEMANTICS ERRORS =====\n");
            writer.write("Total Errors: " + errors.size() + "\n\n");

            for (int i = 0; i < errors.size(); i++) {
                writer.write((i+1) + ") " + errors.get(i) + "\n");
            }

            writer.write("\n===== END OF REPORT =====");
        } catch (IOException e) {
            System.err.println("Failed to write error file: " + e.getMessage());
        }
    }

    public List<String> getSymboles() {
        return symboles;
    }

    public void setSymboles(List<String> symboles) {
        this.symboles = symboles;
    }
}
