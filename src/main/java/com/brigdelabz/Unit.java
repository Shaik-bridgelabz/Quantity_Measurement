package com.brigdelabz;


public enum Unit {
    FEET(12.0), INCH(1.0), YARD(36.0),CENTIMETER(0.4);

    private double baseUnitConversion;

    Unit(double baseUnitConversion) {
        this.baseUnitConversion=baseUnitConversion;
    }

    public static boolean compare(QuantityMeasurement length1, QuantityMeasurement length2) {
        return Double.compare(length1.unit.baseUnitConversion*length1.value,
                length2.unit.baseUnitConversion*length2.value ) ==0;
    }

}
