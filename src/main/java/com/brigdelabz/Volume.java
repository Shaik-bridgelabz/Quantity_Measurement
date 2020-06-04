package com.brigdelabz;

public enum Volume {
    LITRE(1000.0),MILLILITRE(1.0),GALLON(3785.0);

    double baseUnitConversion;

    Volume(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }

    public static boolean compareVolume(QuantityMeasurement volume1, QuantityMeasurement volume2) {
        return Double.compare(volume1.volume.baseUnitConversion*volume1.value,
                volume2.volume.baseUnitConversion*volume2.value ) ==0;
    }
}
