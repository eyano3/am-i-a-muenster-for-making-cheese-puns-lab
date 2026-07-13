package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CheeseWriter {
    public void write(String fileName,
                      int pasteurizedCount,
                      int rawMilkCount,
                      int organicMoistureCount,
                      String mostCommonMilkType) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.println(
                    "Pasteurized milk cheeses: " + pasteurizedCount
            );
            writer.println(
                    "Raw milk cheeses: " + rawMilkCount
            );
            writer.println(
                    "Organic cheeses above 41.0% moisture: "
                            + organicMoistureCount
            );
            writer.println(
                    "Most common milk type: " + mostCommonMilkType
            );
        } catch (IOException exception) {
            System.out.println("Could not write " + fileName);
        }
    }
}
