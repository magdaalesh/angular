package sementicserror;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class duplicatecomponentkeysymboltable {

    private HashMap<String, HashMap<String, HashMap<String, List<String>>>> fileComponentKeys = new HashMap<>();

    public void addTo(String fileName, String componentName, String keyName, String value) throws sementicsexcep {
        fileComponentKeys.putIfAbsent(fileName, new HashMap<>());
        HashMap<String, HashMap<String, List<String>>> componentMap = fileComponentKeys.get(fileName);

        componentMap.putIfAbsent(componentName, new HashMap<>());
        HashMap<String, List<String>> keyMap = componentMap.get(componentName);

        keyMap.putIfAbsent(keyName, new ArrayList<>());

        System.out.println(keyName);
        if ((keyName.equals("template:") && keyMap.containsKey("templateUrl")) ||
                (keyName.equals("templateUrl") && keyMap.containsKey("template:"))) {
            throw new sementicsexcep("Cannot have both 'template' and 'templateUrl' in component: "
                    + componentName + " in file: " + fileName);
        }

        keyMap.get(keyName).add(value);
    }

    public boolean checkIfDuplicate(String fileName, String componentName, String keyName) {
        if (!fileComponentKeys.containsKey(fileName)) return false;
        HashMap<String, HashMap<String, List<String>>> componentMap = fileComponentKeys.get(fileName);
        if (!componentMap.containsKey(componentName)) return false;
        HashMap<String, List<String>> keyMap = componentMap.get(componentName);
        if (!keyMap.containsKey(keyName)) return false;

        return keyMap.get(keyName).size() > 1;
    }

    @Override
    public String toString() {
        if (fileComponentKeys.isEmpty()) return "";

        StringBuilder sb = new StringBuilder();
        sb.append("Component Duplicate Keys Semantic Table:\n");
        sb.append(String.format("%-5s | %-25s | %-20s | %-30s\n", "ID", "Component", "File", "Key"));
        sb.append("-------------------------------------------------------------------------------\n");

        int id = 1;
        boolean hasDuplicates = false;

        for (String fileName : fileComponentKeys.keySet()) {
            HashMap<String, HashMap<String, List<String>>> componentMap = fileComponentKeys.get(fileName);

            for (String componentName : componentMap.keySet()) {
                HashMap<String, List<String>> keyMap = componentMap.get(componentName);

                for (String keyName : keyMap.keySet()) {
                    List<String> values = keyMap.get(keyName);
                    if (values.size() > 1) {
                        sb.append(String.format("%-5d | %-25s | %-20s | %-30s\n",
                                id++, componentName, fileName, keyName));
                        hasDuplicates = true;
                    }
                }
            }
        }

        return hasDuplicates ? sb.toString() : "";
    }
}
