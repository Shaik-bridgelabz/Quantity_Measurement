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
    },

    INCH_TO_FEET {
        @Override
        public boolean LengthConverter(double value1, double value2) {
            return Double.compare(value1,Math.round(value2 * 12)) == 0;
        }
    },

    FEET_TO_YARD {
        @Override
        public boolean LengthConverter(double value1, double value2) {
            return Double.compare(value1,Math.round(value2 * 3)) == 0;
        }
    },

    YARD_TO_FEET {
        @Override
        public boolean LengthConverter(double value1, double value2) {
            return Double.compare(Math.round(value1 * 3),value2) == 0;
        }
    },

    INCH_TO_YARD {
        @Override
        public boolean LengthConverter(double value1, double value2) {
            return Double.compare(value1,Math.round(value2 * 3 * 12)) == 0;
        }
    };


    public abstract boolean LengthConverter(double value1, double value2);

}
