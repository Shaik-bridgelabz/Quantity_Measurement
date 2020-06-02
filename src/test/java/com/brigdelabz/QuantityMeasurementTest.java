package com.brigdelabz;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenFeetValue_whenCompared_shouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void givenFeetValue_whenComparedwithDifferentValue_shouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(2.0);
        Assert.assertNotEquals(feet1,feet2);
    }

    @Test
    public void givenFeetValue_whenComparedwithNullValue_shouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = null;
        Assert.assertNotEquals(feet1,feet2);
    }

    @Test
    public void givenNullValue_whenComparedwithNullValue_shouldReturnEqual() {
        Feet feet1 = null;
        Feet feet2 = null;
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void givenFeetValue_whenComparedwithDifferentReference_shouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        double feet2=0.0;
        Assert.assertNotEquals(feet1,feet2);
    }

    @Test
    public void givenFeetValue_whenComparedwithSameReference_shouldReturnEqual() {
        double feet1 =0.0;
        double feet2=0.0;
        Assert.assertEquals(feet1,feet2,0.0);
    }

    @Test
    public void givenFeetValue_whenComparedwithSameType_shouldReturnEqual() {
        Feet feet1 = new Feet(5.6);
        Feet feet2 = new Feet(5.6);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void givenFeetValue_whenComparedwithDifferentType_shouldReturnNotEqual() {
        Feet feet1 = new Feet(5.6);
        Feet feet2 = new Feet((int)5.6);
        Assert.assertNotEquals(feet1,feet2);
    }

    @Test
    public void givenFeetValue_whenComparedwithSameValue_shouldReturnEqual() {
        Feet feet1 = new Feet(65.235);
        Feet feet2 = new Feet(65.235);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void givenFeetValue_whenComparedwithDifferentFeetValue_shouldReturnNotEqual() {
        Feet feet1 = new Feet(89.65);
        Feet feet2 = new Feet(25.87);
        Assert.assertNotEquals(feet1,feet2);
    }

    @Test
    public void givenInchValue_whenCompared_shouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void givenInchValue_whenComparedwithDifferentValue_shouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(2.0);
        Assert.assertNotEquals(inch1,inch2);
    }
}
