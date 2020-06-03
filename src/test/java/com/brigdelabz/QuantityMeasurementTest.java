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
    public void givenFeetValue0_whenComparedwithInchValue0_shouldReturnEqual() {
        QuantityMeasurement feetinch = new QuantityMeasurement(Unit.FEET_TO_INCH);
        Assert.assertEquals(true,feetinch.unit.LengthConverter(0.0,0.0));
    }

    @Test
    public void givenFeetValue1_whenComparedwithInchValue1_shouldReturnNotEqual() {
        QuantityMeasurement feetinch = new QuantityMeasurement(Unit.FEET_TO_INCH);
        Assert.assertNotEquals(true,feetinch.unit.LengthConverter(1.0,1.0));
    }

    @Test
    public void givenFeetValue1_whenComparedwithInchValue12_shouldReturnEqual() {
        QuantityMeasurement feetinch = new QuantityMeasurement(Unit.FEET_TO_INCH);
        Assert.assertEquals(true,feetinch.unit.LengthConverter(1.0,12.0));
    }

    @Test
    public void givenInchValue0_whenComparedwithFeetValue0_shouldReturnEqual() {
        QuantityMeasurement feetinch = new QuantityMeasurement(Unit.INCH_TO_FEET);
        Assert.assertEquals(true,feetinch.unit.LengthConverter(0.0,0.0));
    }

    @Test
    public void givenInchValue1_whenComparedwithFeetValue1_shouldReturnNotEqual() {
        QuantityMeasurement feetinch = new QuantityMeasurement(Unit.INCH_TO_FEET);
        Assert.assertNotEquals(true,feetinch.unit.LengthConverter(1.0,1.0));
    }

    @Test
    public void givenInchValue12_whenComparedwithFeetValue1_shouldReturnEqual() {
        QuantityMeasurement feetinch = new QuantityMeasurement(Unit.INCH_TO_FEET);
        Assert.assertEquals(true,feetinch.unit.LengthConverter(12.0,1.0));
    }

    @Test
    public void givenFeetValue3_whenComparedwithYardValue1_shouldReturnEqual() {
        QuantityMeasurement feetinch = new QuantityMeasurement(Unit.FEET_TO_YARD);
        Assert.assertEquals(true,feetinch.unit.LengthConverter(3.0,1.0));
    }

    @Test
    public void givenFeetValue1_whenComparedwithYardValue1_shouldReturnNotEqual() {
        QuantityMeasurement feetinch = new QuantityMeasurement(Unit.FEET_TO_YARD);
        Assert.assertNotEquals(true,feetinch.unit.LengthConverter(1.0,1.0));
    }

    @Test
    public void givenYardValue1_whenComparedwithFeetValue3_shouldReturnEqual() {
        QuantityMeasurement feetinch = new QuantityMeasurement(Unit.YARD_TO_FEET);
        Assert.assertEquals(true,feetinch.unit.LengthConverter(1.0,3.0));
    }

    @Test
    public void givenInchValue1_whenComparedwithYardValue1_shouldReturnNotEqual() {
        QuantityMeasurement feetinch = new QuantityMeasurement(Unit.INCH_TO_YARD);
        Assert.assertNotEquals(true,feetinch.unit.LengthConverter(1.0,1.0));
    }

    @Test
    public void givenInchValue36_whenComparedwithYardValue1_shouldReturnEqual() {
        QuantityMeasurement feetinch = new QuantityMeasurement(Unit.INCH_TO_YARD);
        Assert.assertEquals(true,feetinch.unit.LengthConverter(36.0,1.0));
    }

    @Test
    public void givenYardValue1_whenComparedwithYardValue36_shouldReturnEqual() {
        QuantityMeasurement feetinch = new QuantityMeasurement(Unit.YARD_TO_INCH);
        Assert.assertEquals(true,feetinch.unit.LengthConverter(1.0,36.0));
    }
}
