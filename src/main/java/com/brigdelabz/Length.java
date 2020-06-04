package com.brigdelabz;


public enum Length {
    FEET(12.0), INCH(1.0), YARD(36.0),CENTIMETER(0.4);

    private double baseUnitConversion;

    Length(double baseUnitConversion) {
        this.baseUnitConversion=baseUnitConversion;
    }

    public static boolean compareLength(QuantityMeasurement length1, QuantityMeasurement length2) {
        return Double.compare(length1.length.baseUnitConversion*length1.value,
                length2.length.baseUnitConversion*length2.value ) ==0;
    }

    public static double addLengthQuantities(QuantityMeasurement length1, QuantityMeasurement length2)
    {
        double addition =  (length1.value*length1.length.baseUnitConversion)+(length2.value*length2.length.baseUnitConversion);
        return addition;
    }
}
