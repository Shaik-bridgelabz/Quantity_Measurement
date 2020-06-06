package com.brigdelabz;

public class QuantityMeasurement {

    public double value;
    public DifferentQuantities differentQuantities;

    public QuantityMeasurement(DifferentQuantities quantity, double value) {
        this.value=value;
        this.differentQuantities =quantity;
    }

    public static boolean compareQuantity(QuantityMeasurement value1, QuantityMeasurement value2) {
        return DifferentQuantities.compareQuantity(value1,value2);
    }

    public static double addQuantity(QuantityMeasurement value1, QuantityMeasurement value2) {
        return DifferentQuantities.addQuantity(value1,value2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.value, value) == 0;
    }

}
