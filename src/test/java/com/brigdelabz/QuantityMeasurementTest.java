package com.brigdelabz;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenFeetValue_whenCompared_shouldReturnEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Unit.FEET,0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Unit.FEET,0.0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void givenFeetValue_whenComparedwithDifferentValue_shouldReturnNotEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Unit.FEET,0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Unit.FEET,1.0);
        Assert.assertNotEquals(feet1,feet2);
    }

    @Test
    public void givenFeetValue_whenComparedwithNullValue_shouldReturnNotEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Unit.FEET,0.0);
        QuantityMeasurement feet2 = null;
        Assert.assertNotEquals(feet1,feet2);
    }

    @Test
    public void givenFeetValue_whenComparedwithDifferentReference_shouldReturnNotEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET,0.0);
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH,0.0);
        Assert.assertNotEquals(feet,inch);
    }

    @Test
    public void givenFeetValue_whenComparedwithSameReference_shouldReturnEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Unit.FEET,0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Unit.FEET,0.0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void givenFeetValue_whenComparedwithSameType_shouldReturnEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Unit.FEET,5.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Unit.FEET,5.0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void givenFeetValue_whenComparedwithDifferentType_shouldReturnNotEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Unit.FEET,5.6);
        QuantityMeasurement feet2 = new QuantityMeasurement(Unit.FEET,(int)5.6);
        Assert.assertNotEquals(feet1,feet2);
    }

    @Test
    public void givenFeetValue_whenComparedwithSameValue_shouldReturnEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Unit.FEET,25.65);
        QuantityMeasurement feet2 = new QuantityMeasurement(Unit.FEET,25.65);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void givenFeetValue_whenComparedwithDifferentFeetValue_shouldReturnNotEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Unit.FEET,63.5);
        QuantityMeasurement feet2 = new QuantityMeasurement(Unit.FEET,98.145);
        Assert.assertNotEquals(feet1,feet2);
    }

    @Test
    public void givenInchValue_whenCompared_shouldReturnEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH,0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Unit.INCH,0.0);
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void givenInchValue_whenComparedwithDifferentValue_shouldReturnNotEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH,0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Unit.INCH,1.0);
        Assert.assertNotEquals(inch1,inch2);
    }

    @Test
    public void givenInchValue_whenComparedwithNullValue_shouldReturnNotEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH,0.0);
        QuantityMeasurement inch2 = null;
        Assert.assertNotEquals(inch1,inch2);
    }

    @Test
    public void givenInchValue_whenComparedwithDifferentReference_shouldReturnNotEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH,0.0);
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET,0.0);
        Assert.assertNotEquals(feet,inch);
    }

    @Test
    public void givenInchValue_whenComparedwithDifferentType_shouldReturnNotEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH,5.6);
        QuantityMeasurement inch2 = new QuantityMeasurement(Unit.INCH,(int)5.6);
        Assert.assertNotEquals(inch1,inch2);
    }

    @Test
    public void givenInchValue_whenComparedwithSameValue_shouldReturnEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH,22.65);
        QuantityMeasurement inch2 = new QuantityMeasurement(Unit.INCH,22.65);
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void givenInchValue_whenComparedwithDifferentInchValue_shouldReturnNotEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH,66.9);
        QuantityMeasurement inch2 = new QuantityMeasurement(Unit.INCH,72.5);
        Assert.assertNotEquals(inch1,inch2);
    }

    @Test
    public void givenFeetValue0_whenComparedwithInchValue0_shouldReturnEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH,0.0);
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET,0.0);
        Assert.assertEquals(true,Unit.compare(inch,feet));
    }

    @Test
    public void givenFeetValue1_whenComparedwithInchValue1_shouldReturnNotEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH,1.0);
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET,1.0);
        Assert.assertNotEquals(true,Unit.compare(inch,feet));
    }

    @Test
    public void givenFeetValue1_whenComparedwithInchValue12_shouldReturnEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH,12.0);
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET,1.0);
        Assert.assertEquals(true,Unit.compare(feet,inch));
    }

    @Test
    public void givenInchValue12_whenComparedwithFeetValue1_shouldReturnEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH,12.0);
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET,1.0);
        Assert.assertEquals(true,Unit.compare(inch,feet));
    }

    @Test
    public void givenFeetValue3_whenComparedwithYardValue1_shouldReturnEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET,3.0);
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD,1.0);
        Assert.assertEquals(true,Unit.compare(feet,yard));
    }

    @Test
    public void givenFeetValue1_whenComparedwithYardValue1_shouldReturnNotEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET,1.0);
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD,1.0);
        Assert.assertNotEquals(true,Unit.compare(feet,yard));
    }

    @Test
    public void givenYardValue1_whenComparedwithFeetValue3_shouldReturnEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET,3.0);
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD,1.0);
        Assert.assertEquals(true,Unit.compare(yard,feet));
    }

    @Test
    public void givenInchValue36_whenComparedwithYardValue1_shouldReturnEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH,36.0);
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD,1.0);
        Assert.assertEquals(true,Unit.compare(inch,yard));
    }

    @Test
    public void givenInchValue96_whenComparedwithYardValue2_shouldReturnNotEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH,96.0);
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD,2.0);
        Assert.assertNotEquals(true,Unit.compare(inch,yard));
    }

    @Test
    public void givenInchValue2_whenComparedwithCentiMeterValue5_shouldReturnEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH,2.0);
        QuantityMeasurement cm = new QuantityMeasurement(Unit.CENTIMETER,5.0);
        Assert.assertEquals(true,Unit.compare(inch,cm));
    }

    @Test
    public void givenInchValue1_whenComparedwithCentiMeterValue1_shouldReturnNotEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH,1.0);
        QuantityMeasurement cm = new QuantityMeasurement(Unit.CENTIMETER,1.0);
        Assert.assertNotEquals(true,Unit.compare(inch,cm));
    }

    @Test
    public void givenFeetvalue1_whenComparedwithCentiMeterValue60_shouldReturnEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.FEET,1.0);
        QuantityMeasurement cm = new QuantityMeasurement(Unit.CENTIMETER,30.0);
        Assert.assertEquals(true,Unit.compare(inch,cm));
    }

    @Test
    public void givenInchvalue2_whenAddedWithInchValue2_shouldReturnEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH,2.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Unit.INCH,2.0);
        double addition = Unit.addQuantities(inch1, inch2);
        Assert.assertEquals(4.0,addition,0.0);
    }

    @Test
    public void givenFeetvalue1_whenAddedWithInchValue2_shouldReturnEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET,1.0);
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH,2.0);
        double addition = Unit.addQuantities(feet, inch);
        Assert.assertEquals(14.0,addition,0.0);
    }

    @Test
    public void givenFeetvalue1_whenAddedWithInchValue1_shouldReturnNotEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET,1.0);
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH,1.0);
        double addition = Unit.addQuantities(feet, inch);
        Assert.assertNotEquals(5.0,addition,0.0);
    }

    @Test
    public void givenFeetvalue1_whenAddedWithFeetValue1_shouldReturnEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Unit.FEET,1.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Unit.FEET,1.0);
        double addition = Unit.addQuantities(feet1, feet2);
        Assert.assertEquals(24.0,addition,0.0);
    }

    @Test
    public void givenInchvalue2_whenAddedWithCentiMeterValue2_5_shouldReturnEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH,2.0);
        QuantityMeasurement cm = new QuantityMeasurement(Unit.CENTIMETER,2.5);
        double addition = Unit.addQuantities(inch, cm);
        Assert.assertEquals(3.0,addition,0.0);
    }
}
