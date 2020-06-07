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
    FAHRENHIET(QuantityType.TEMPERATURE,1.0),
    CELSIUS(QuantityType.TEMPERATURE,1.0),
    KELVIN(QuantityType.TEMPERATURE,274.15);

    private double baseConversionValue;
    private QuantityType type;

    DifferentQuantities(QuantityType type, double baseConversionValue) {
        this.type = type;
        this.baseConversionValue = baseConversionValue;
    }

    public static boolean compareQuantity(QuantityMeasurement value1, QuantityMeasurement value2) {
        if (value1.differentQuantities.type.equals(value2.differentQuantities.type))
            if (value1.differentQuantities.equals(DifferentQuantities.FAHRENHIET))
                value1.value = covertToCelsius(value1.value);
            if (value1.differentQuantities.equals(DifferentQuantities.CELSIUS))
                value1.value = covertToFahrienhiet(value1.value);
        return (Double.compare(Math.round(value1.value * value1.differentQuantities.baseConversionValue),
                    Math.round(value2.value * value2.differentQuantities.baseConversionValue)) == 0);
    }

    private static double covertToFahrienhiet(double value) {
        double newValue = Math.round(1.8 * value + 32);
        return newValue;
    }

    private static double covertToCelsius(double value) {
        double newValue = Math.round(((value - 32) * 5) / 9);
        return newValue;
    }

    public static double addQuantity(QuantityMeasurement value1, QuantityMeasurement value2) {
        if (value1.differentQuantities.type.equals(QuantityType.TEMPERATURE))
            throw new QuantityMeasurementException(QuantityMeasurementException.TypeOfException.
                                                    IMPROPER_QUANTITY,"Temperatures Cannot be added.");
        if (value1.differentQuantities.type.equals(value2.differentQuantities.type))
            return (value1.value * value1.differentQuantities.baseConversionValue +
                    value2.value * value2.differentQuantities.baseConversionValue);
        throw new QuantityMeasurementException(QuantityMeasurementException.TypeOfException.
                                                    IMPROPER_QUANTITY,"Cannot add Different type of Quantities.");
    }
}