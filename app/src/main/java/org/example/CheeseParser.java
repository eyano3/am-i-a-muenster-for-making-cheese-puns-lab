package org.example;

public class CheeseParser {
    private CheeseRowCleaner rowCleaner = new CheeseRowCleaner();

    public Cheese parse(String row) {
        String[] values = rowCleaner.clean(row);

        if (values.length < 10) {
            return null;
        }

        double moisturePercent = -1.0;

        if (!values[3].isEmpty()) {
            try {
                moisturePercent = Double.parseDouble(values[3]);
            } catch (NumberFormatException exception) {
                moisturePercent = -1.0;
            }
        }

        boolean organic = values[6].equals("1");
        String milkType = values[8];
        String milkTreatmentType = values[9];

        return new Cheese(
                moisturePercent,
                organic,
                milkType,
                milkTreatmentType
        );
    }
}