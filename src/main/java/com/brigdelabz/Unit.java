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
                return Double.compare(Math.round(value1 * FEET_INCH_MULTIPLIER), value2) == 0;
            }
    },

    INCH_TO_FEET {
        @Override
        public boolean LengthConverter(double value1, double value2) {
            return Double.compare(value1,Math.round(value2 * FEET_INCH_MULTIPLIER)) == 0;
        }
    },

    FEET_TO_YARD {
        @Override
        public boolean LengthConverter(double value1, double value2) {
            return Double.compare(value1,Math.round(value2 * YARD_FEET_MULTILIER)) == 0;
        }
    },

    YARD_TO_FEET {
        @Override
        public boolean LengthConverter(double value1, double value2) {
            return Double.compare(Math.round(value1 * YARD_FEET_MULTILIER),value2) == 0;
        }
    },

    INCH_TO_YARD {
        @Override
        public boolean LengthConverter(double value1, double value2) {
            return Double.compare(value1,Math.round(value2 * YARD_FEET_MULTILIER * FEET_INCH_MULTIPLIER)) == 0;
        }
    },

    YARD_TO_INCH {
        @Override
        public boolean LengthConverter(double value1, double value2) {
            return Double.compare(Math.round(value1 * YARD_FEET_MULTILIER * FEET_INCH_MULTIPLIER),value2) == 0;
        }
    };


    public abstract boolean LengthConverter(double value1, double value2);
    private static final double FEET_INCH_MULTIPLIER=12;
    private static final double YARD_FEET_MULTILIER=3;
}
