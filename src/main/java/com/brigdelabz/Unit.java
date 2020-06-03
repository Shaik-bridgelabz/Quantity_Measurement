package com.brigdelabz;


public enum Unit {
    FEET {
            @Override
            public boolean LengthConverter(double value1, double value2) {
                return Double.compare(value1, value2) == 0;
            }
    },

    INCH {
            @Override
            public boolean LengthConverter(double value1, double value2) {
                return Double.compare(value1, value2) == 0;
            }
    },

    FEET_TO_INCH {
            @Override
            public boolean LengthConverter(double value1, double value2) {
                return Double.compare(Math.round(value1 * 12), value2) == 0;
            }
    };

    public abstract boolean LengthConverter(double value1, double value2);

}
