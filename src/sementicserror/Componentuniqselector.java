package sementicserror;

import java.util.HashMap;
import java.util.Map;

public class Componentuniqselector {


    private Map<String, Map<String, Integer>> componentSelector = new HashMap<>();


    public boolean checkifselectorisuniqandadd(String value, int line, String currentFile) {
        if (componentSelector.containsKey(value.trim())) {




            return false;
        }


        Map<String, Integer> fileLineMap = new HashMap<>();
        fileLineMap.put(currentFile, line);
        componentSelector.put(value, fileLineMap);
        return true;
    }

    @Override
    public String toString() {
        if (componentSelector.isEmpty()) {
            return "No component selectors entries.";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Component Selectors Semantic Table:\n");
        sb.append(String.format("%-5s | %-25s | %-20s | %-5s\n", "ID", "Selector", "File", "Line"));
        sb.append("-----------------------------------------------------------------\n");

        int id = 1;
        for (Map.Entry<String, Map<String, Integer>> entry : componentSelector.entrySet()) {
            String selector = entry.getKey();
            Map<String, Integer> fileLineMap = entry.getValue();

            for (Map.Entry<String, Integer> fileEntry : fileLineMap.entrySet()) {
                sb.append(String.format("%-5d | %-25s | %-20s | %-5d\n",
                        id++, selector, fileEntry.getKey(), fileEntry.getValue()));
            }
        }

        return sb.toString();
    }




}
