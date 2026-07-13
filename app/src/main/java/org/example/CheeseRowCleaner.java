package org.example;

import java.util.ArrayList;

public class CheeseRowCleaner {
    public String[] clean(String row) {
        ArrayList<String> values = new ArrayList<>();
        String currentValue = "";
        boolean insideQuotes = false;

        for (int i = 0; i < row.length(); i++) {
            char currentCharacter = row.charAt(i);

            if (currentCharacter == '"') {
                if (insideQuotes
                        && i + 1 < row.length()
                        && row.charAt(i + 1) == '"') {
                    currentValue += '"';
                    i++;
                } else {
                    insideQuotes = !insideQuotes;
                }
            } else if (currentCharacter == ',' && !insideQuotes) {
                values.add(currentValue.trim());
                currentValue = "";
            } else {
                currentValue += currentCharacter;
            }
        }

        values.add(currentValue.trim());

        return values.toArray(new String[0]);
    }
}
