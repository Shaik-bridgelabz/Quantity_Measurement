package com.brigdelabz;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenFeetValue_whenCompared_shouldReturnEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET);
        Assert.assertEquals(true,feet.unit.LengthConverter(0.0,0.0));
    }

    @Test
    public void givenFeetValue_whenComparedwithDifferentValue_shouldReturnNotEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET);
        Assert.assertNotEquals(true,feet.unit.LengthConverter(0.0,1.0));
    }

    @Test
    public void givenFeetValue_whenComparedwithSameType_shouldReturnEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET);
        Assert.assertEquals(true,feet.unit.LengthConverter(5.6,5.6));
    }

    @Test
    public void givenFeetValue_whenComparedwithDifferentType_shouldReturnNotEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET);
        Assert.assertNotEquals(true,feet.unit.LengthConverter(5.6,(int)5.6));
    }

    @Test
    public void givenFeetValue_whenComparedwithSameValue_shouldReturnEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET);
        Assert.assertEquals(true,feet.unit.LengthConverter(28.66,28.66));
    }

    @Test
    public void givenFeetValue_whenComparedwithDifferentFeetValue_shouldReturnNotEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET);
        Assert.assertNotEquals(true,feet.unit.LengthConverter(28.66,69.55));
    }

    @Test
    public void givenInchValue_whenCompared_shouldReturnEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH);
        Assert.assertEquals(true,inch.unit.LengthConverter(0.0,0.0));
    }

    @Test
    public void givenInchValue_whenComparedwithDifferentValue_shouldReturnNotEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH);
        Assert.assertNotEquals(true,inch.unit.LengthConverter(0.0,1.0));
    }

    @Test
    public void givenInchValue_whenComparedwithSameType_shouldReturnEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH);
        Assert.assertEquals(true,inch.unit.LengthConverter(55.5,55.5));
    }

    @Test
    public void givenInchValue_whenComparedwithDifferentType_shouldReturnNotEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH);
        Assert.assertNotEquals(true,inch.unit.LengthConverter(55.5,(int)55.5));
    }

    @Test
    public void givenInchValue_whenComparedwithSameValue_shouldReturnEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH);
        Assert.assertEquals(true,inch.unit.LengthConverter(55.5,55.5));
    }

    @Test
    public void givenInchValue_whenComparedwithDifferentInchValue_shouldReturnNotEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH);
        Assert.assertNotEquals(true,inch.unit.LengthConverter(55.5,89.99));
    }

    @Test
    public void givenFeetValue_whenComparedwithInchValue_shouldReturnEqual() {
        QuantityMeasurement feetinch = new QuantityMeasurement(Unit.FEET_TO_INCH);
        Assert.assertEquals(true,feetinch.unit.LengthConverter(0.0,0.0));
    }
}
