package com.brigdelabz;

public class QuantityMeasurement {

    public double value;
    public Unit unit;

    public QuantityMeasurement(Unit unit,double value) {
        this.value=value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.value, value) == 0 &&
                unit == that.unit;
    }

}
