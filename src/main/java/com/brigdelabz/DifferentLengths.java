package com.brigdelabz;

public class DifferentLengths {

    private final double value;
    private final Unit unit;

    enum Unit {
        FEET,INCH;
    }

    public DifferentLengths(Unit unit, double value) {
        this.unit=unit;
        this.value=value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DifferentLengths that = (DifferentLengths) o;
        return Double.compare(that.value, value) == 0 &&
                unit == that.unit;
    }

}
