package com.brigdelabz;

public class QuantityMeasurement {

    public double value;
    public Length length;
    public Volume volume;

    public QuantityMeasurement(Length length, double value) {
        this.value=value;
        this.length = length;
    }

    public QuantityMeasurement(Volume volume, double value) {
        this.volume=volume;
        this.value=value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.value, value) == 0 &&
                length == that.length;
    }

}
