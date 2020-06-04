package com.brigdelabz;

public enum Volume {
    LITRE(1.0),MILLILITRE(0.001),GALLON(3.78);

    double baseUnitConversion;

    Volume(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }

    public static boolean compareVolume(QuantityMeasurement volume1, QuantityMeasurement volume2) {
        return Double.compare(volume1.volume.baseUnitConversion*volume1.value,
                volume2.volume.baseUnitConversion*volume2.value ) ==0;
    }

    public static double addVolumeQuantities(QuantityMeasurement volume1, QuantityMeasurement volume2)
    {
        double addition =  (volume1.value*volume1.volume.baseUnitConversion)+(volume2.value*volume2.volume.baseUnitConversion);
        return addition;
    }
}
