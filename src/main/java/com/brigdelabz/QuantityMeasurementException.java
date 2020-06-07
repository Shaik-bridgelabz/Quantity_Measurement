package com.brigdelabz;

public class QuantityMeasurementException extends RuntimeException {

    enum  TypeOfException{
        IMPROPER_QUANTITY;
    }

    public TypeOfException type;

    public QuantityMeasurementException(TypeOfException type,String message) {
        super(message);
        this.type=type;
    }
}
