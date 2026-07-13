package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheeseReader {
    public CheeseList read(String fileName) {
        CheeseList cheeseList = new CheeseList();
        CheeseParser parser = new CheeseParser();

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(fileName))) {
            reader.readLine();

            String row;

            while ((row = reader.readLine()) != null) {
                Cheese cheese = parser.parse(row);

                if (cheese != null) {
                    cheeseList.add(cheese);
                }
            }
        } catch (IOException exception) {
            System.out.println("Could not read " + fileName);
        }

        return cheeseList;
    }
}
