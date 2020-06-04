package com.brigdelabz;

public class QuantityMeasurement {

    public double value;
    public DifferentQuantities differentQuantities;

    public QuantityMeasurement(DifferentQuantities quantity, double value) {
        this.value=value;
        this.differentQuantities =quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.value, value) == 0;
    }

}
