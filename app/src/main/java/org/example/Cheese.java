package org.example;

public class Cheese {
    private double moisturePercent;
    private boolean organic;
    private String milkType;
    private String milkTreatmentType;

    public Cheese(double moisturePercent, boolean organic,
                  String milkType, String milkTreatmentType) {
        this.moisturePercent = moisturePercent;
        this.organic = organic;
        this.milkType = milkType;
        this.milkTreatmentType = milkTreatmentType;
    }

    public double getMoisturePercent() {
        return moisturePercent;
    }

    public boolean isOrganic() {
        return organic;
    }

    public String getMilkType() {
        return milkType;
    }

    public String getMilkTreatmentType() {
        return milkTreatmentType;
    }
}
