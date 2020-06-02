package com.brigdelabz;

import org.junit.Assert;
import org.junit.Test;

public class DifferentLengthsTest {

    @Test
    public void givenFeetValue_whenCompared_shouldReturnEqual() {
        DifferentLengths feet1 = new DifferentLengths(DifferentLengths.Unit.FEET,0.0);
        DifferentLengths feet2 = new DifferentLengths(DifferentLengths.Unit.FEET,0.0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void givenFeetValue_whenComparedwithDifferentValue_shouldReturnNotEqual() {
        DifferentLengths feet1 = new DifferentLengths(DifferentLengths.Unit.FEET,0.0);
        DifferentLengths feet2 = new DifferentLengths(DifferentLengths.Unit.FEET,2.0);
        Assert.assertNotEquals(feet1,feet2);
    }

    @Test
    public void givenFeetValue_whenComparedwithNullValue_shouldReturnNotEqual() {
        DifferentLengths feet1 = new DifferentLengths(DifferentLengths.Unit.FEET,0.0);
        DifferentLengths feet2 = null;
        Assert.assertNotEquals(feet1,feet2);
    }

    @Test
    public void givenNullValue_whenComparedwithNullValue_shouldReturnEqual() {
        DifferentLengths feet1 = null;
        DifferentLengths feet2 = null;
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void givenFeetValue_whenComparedwithDifferentReference_shouldReturnNotEqual() {
        DifferentLengths feet1 = new DifferentLengths(DifferentLengths.Unit.FEET,0.0);
        DifferentLengths feet2 = new DifferentLengths(DifferentLengths.Unit.INCH,0.0);
        Assert.assertNotEquals(feet1,feet2);
    }

    @Test
    public void givenFeetValue_whenComparedwithSameReference_shouldReturnEqual() {
        DifferentLengths feet1 = new DifferentLengths(DifferentLengths.Unit.FEET,0.0);
        DifferentLengths feet2 = new DifferentLengths(DifferentLengths.Unit.FEET,0.0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void givenFeetValue_whenComparedwithSameType_shouldReturnEqual() {
        DifferentLengths feet1 = new DifferentLengths(DifferentLengths.Unit.FEET,5.0);
        DifferentLengths feet2 = new DifferentLengths(DifferentLengths.Unit.FEET,5.0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void givenFeetValue_whenComparedwithDifferentType_shouldReturnNotEqual() {
        DifferentLengths feet1 = new DifferentLengths(DifferentLengths.Unit.FEET,5.6);
        DifferentLengths feet2 = new DifferentLengths(DifferentLengths.Unit.FEET,(int)5);
        Assert.assertNotEquals(feet1,feet2);
    }

    @Test
    public void givenFeetValue_whenComparedwithSameValue_shouldReturnEqual() {
        DifferentLengths feet1 = new DifferentLengths(DifferentLengths.Unit.FEET,24.74);
        DifferentLengths feet2 = new DifferentLengths(DifferentLengths.Unit.FEET,24.74);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void givenFeetValue_whenComparedwithDifferentFeetValue_shouldReturnNotEqual() {
        DifferentLengths feet1 = new DifferentLengths(DifferentLengths.Unit.FEET,5.6);
        DifferentLengths feet2 = new DifferentLengths(DifferentLengths.Unit.FEET,69.25);
        Assert.assertNotEquals(feet1,feet2);
    }

    @Test
    public void givenInchValue_whenCompared_shouldReturnEqual() {
        DifferentLengths inch1 = new DifferentLengths(DifferentLengths.Unit.INCH,0.0);
        DifferentLengths inch2 = new DifferentLengths(DifferentLengths.Unit.INCH,0.0);
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void givenInchValue_whenComparedwithDifferentValue_shouldReturnNotEqual() {
        DifferentLengths inch1 = new DifferentLengths(DifferentLengths.Unit.INCH,0.0);
        DifferentLengths inch2 = new DifferentLengths(DifferentLengths.Unit.INCH,2.0);
        Assert.assertNotEquals(inch1,inch2);
    }

    @Test
    public void givenInchValue_whenComparedwithNullValue_shouldReturnNotEqual() {
        DifferentLengths inch1 = new DifferentLengths(DifferentLengths.Unit.INCH,5.6);
        DifferentLengths inch2 = null;
        Assert.assertNotEquals(inch1,inch2);
    }

    @Test
    public void givenNullInchValue_whenComparedwithNullValue_shouldReturnEqual() {
        DifferentLengths inch1 = null;
        DifferentLengths inch2 = null;
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void givenInchValue_whenComparedwithDifferentReference_shouldReturnNotEqual() {
        DifferentLengths inch = new DifferentLengths(DifferentLengths.Unit.INCH,5.6);
        DifferentLengths feet = new DifferentLengths(DifferentLengths.Unit.FEET,5.6);
        Assert.assertNotEquals(feet,inch);
    }

    @Test
    public void givenInchValue_whenComparedwithSameReference_shouldReturnEqual() {
        DifferentLengths inch = new DifferentLengths(DifferentLengths.Unit.INCH,5.6);
        Assert.assertEquals(inch,inch);
    }

    @Test
    public void givenInchValue_whenComparedwithSameType_shouldReturnEqual() {
        DifferentLengths inch1 = new DifferentLengths(DifferentLengths.Unit.INCH,5.6);
        DifferentLengths inch2 = new DifferentLengths(DifferentLengths.Unit.INCH,5.6);
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void givenInchValue_whenComparedwithDifferentType_shouldReturnNotEqual() {
        DifferentLengths inch1 = new DifferentLengths(DifferentLengths.Unit.INCH,5.6);
        DifferentLengths inch2 = new DifferentLengths(DifferentLengths.Unit.INCH,(int)5.0);
        Assert.assertNotEquals(inch1,inch2);
    }

    @Test
    public void givenInchValue_whenComparedwithSameValue_shouldReturnEqual() {
        DifferentLengths inch1 = new DifferentLengths(DifferentLengths.Unit.INCH,22.65);
        DifferentLengths inch2 = new DifferentLengths(DifferentLengths.Unit.INCH,22.65);
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void givenInchValue_whenComparedwithDifferentInchValue_shouldReturnNotEqual() {
        DifferentLengths inch1 = new DifferentLengths(DifferentLengths.Unit.INCH,5.6);
        DifferentLengths inch2 = new DifferentLengths(DifferentLengths.Unit.INCH,72.5);
        Assert.assertNotEquals(inch1,inch2);
    }
}
