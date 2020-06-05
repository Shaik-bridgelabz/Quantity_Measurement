package com.brigdelabz;

public enum DifferentQuantities {
    INCH(QuantityType.LENGTH, 1.0),
    FEET(QuantityType.LENGTH,12.0),
    YARD(QuantityType.LENGTH,36.0),
    CENTIMETER(QuantityType.LENGTH,0.4),
    LITRE(QuantityType.VOLUME,1.0),
    MILLILITRE(QuantityType.VOLUME,0.001),
    GALLON(QuantityType.VOLUME,3.78),
    KILOGRAM(QuantityType.MASS,1.0),
    GRAM(QuantityType.MASS,0.001),
    TONNE(QuantityType.MASS,1000),
    FAHRENHIET(QuantityType.TEMPERATURE,33.8),
    CELSIUS(QuantityType.TEMPERATURE,1.0),
    KELVIN(QuantityType.TEMPERATURE,274.15);

    private double baseConversionUnit;
    private QuantityType type;

    DifferentQuantities(QuantityType type, double baseConversionUnit) {
        this.type = type;
        this.baseConversionUnit = baseConversionUnit;
    }

    public static boolean compareQuantity(QuantityMeasurement value1, QuantityMeasurement value2) {
        if (value1.differentQuantities.type.equals(value2.differentQuantities.type))
            return (Double.compare(Math.round(value1.value * value1.differentQuantities.baseConversionUnit),
                    Math.round(value2.value * value2.differentQuantities.baseConversionUnit)) == 0);
        return false;
    }

    public static boolean compareTempQuantity(QuantityMeasurement value1, QuantityMeasurement value2) {
        if (value1.differentQuantities.type.equals(value2.differentQuantities.type))
            return (Double.compare(Math.round((value1.value -32) * (5/9)),
                    Math.round(value2.value-32)*(5/9)) == 0);
        return false;
    }

    public static double addQuantity(QuantityMeasurement value1, QuantityMeasurement value2) {
        if (value1.differentQuantities.type.equals(value2.differentQuantities.type))
            return (value1.value * value1.differentQuantities.baseConversionUnit +
                    value2.value * value2.differentQuantities.baseConversionUnit);
        return 0.0;
    }
}