package org.example;

import java.util.ArrayList;

public class CheeseList {
    private ArrayList<Cheese> cheeses = new ArrayList<>();

    public void add(Cheese cheese) {
        cheeses.add(cheese);
    }

    public int countByMilkTreatment(String treatment) {
        int count = 0;

        for (Cheese cheese : cheeses) {
            if (cheese.getMilkTreatmentType().equalsIgnoreCase(treatment)) {
                count++;
            }
        }

        return count;
    }

    public int countOrganicAboveMoisture(double minimumMoisture) {
        int count = 0;

        for (Cheese cheese : cheeses) {
            if (cheese.isOrganic()
                    && cheese.getMoisturePercent() > minimumMoisture) {
                count++;
            }
        }

        return count;
    }

    public String getMostCommonMilkType() {
        int cowCount = 0;
        int goatCount = 0;
        int eweCount = 0;
        int buffaloCount = 0;

        for (Cheese cheese : cheeses) {
            String milkType = cheese.getMilkType().toLowerCase();

            if (milkType.contains("buffalo")) {
                buffaloCount++;
            } else {
                if (milkType.contains("cow")) {
                    cowCount++;
                }

                if (milkType.contains("goat")) {
                    goatCount++;
                }

                if (milkType.contains("ewe")) {
                    eweCount++;
                }
            }
        }

        String mostCommonMilkType = "Cow";
        int highestCount = cowCount;

        if (goatCount > highestCount) {
            mostCommonMilkType = "Goat";
            highestCount = goatCount;
        }

        if (eweCount > highestCount) {
            mostCommonMilkType = "Ewe";
            highestCount = eweCount;
        }

        if (buffaloCount > highestCount) {
            mostCommonMilkType = "Buffalo";
        }

        return mostCommonMilkType;
    }
}