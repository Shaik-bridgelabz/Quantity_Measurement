package com.brigdelabz;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenFeetValue_whenCompared_shouldReturnEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(DifferentQuantities.FEET,0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(DifferentQuantities.FEET,0.0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void givenFeetValue_whenComparedwithDifferentValue_shouldReturnNotEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(DifferentQuantities.FEET,0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(DifferentQuantities.FEET,1.0);
        Assert.assertNotEquals(feet1,feet2);
    }

    @Test
    public void givenFeetValue_whenComparedwithNullValue_shouldReturnNotEqual() {
        try {
            QuantityMeasurement feet1 = new QuantityMeasurement(DifferentQuantities.FEET, 0.0);
            QuantityMeasurement feet2 = null;
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.TypeOfException.ENTERED_NULL, e.type);
        }
    }

    @Test
    public void givenFeetValue_whenComparedwithSameReference_shouldReturnEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(DifferentQuantities.FEET,0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(DifferentQuantities.FEET,0.0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void givenFeetValue_whenComparedwithSameType_shouldReturnEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(DifferentQuantities.FEET,5.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(DifferentQuantities.FEET,5.0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void givenFeetValue_whenComparedwithDifferentType_shouldReturnNotEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(DifferentQuantities.FEET,5.6);
        QuantityMeasurement feet2 = new QuantityMeasurement(DifferentQuantities.FEET,(int)5.6);
        Assert.assertNotEquals(feet1,feet2);
    }

    @Test
    public void givenFeetValue_whenComparedwithSameValue_shouldReturnEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(DifferentQuantities.FEET,25.65);
        QuantityMeasurement feet2 = new QuantityMeasurement(DifferentQuantities.FEET,25.65);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void givenFeetValue_whenComparedwithDifferentFeetValue_shouldReturnNotEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(DifferentQuantities.FEET,63.5);
        QuantityMeasurement feet2 = new QuantityMeasurement(DifferentQuantities.FEET,98.145);
        Assert.assertNotEquals(feet1,feet2);
    }

    @Test
    public void givenInchValue_whenCompared_shouldReturnEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(DifferentQuantities.INCH,0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(DifferentQuantities.INCH,0.0);
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void givenInchValue_whenComparedwithDifferentValue_shouldReturnNotEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(DifferentQuantities.INCH,0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(DifferentQuantities.INCH,1.0);
        Assert.assertNotEquals(inch1,inch2);
    }

    @Test
    public void givenInchValue_whenComparedwithNullValue_shouldReturnNotEqual() {
        try {
            QuantityMeasurement inch1 = new QuantityMeasurement(DifferentQuantities.INCH, 0.0);
            QuantityMeasurement inch2 = null;
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.TypeOfException.ENTERED_NULL, e.type);
        }
    }

    @Test
    public void givenInchValue_whenComparedwithDifferentType_shouldReturnNotEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(DifferentQuantities.INCH,5.6);
        QuantityMeasurement inch2 = new QuantityMeasurement(DifferentQuantities.INCH,(int)5.6);
        Assert.assertNotEquals(inch1,inch2);
    }

    @Test
    public void givenInchValue_whenComparedwithSameValue_shouldReturnEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(DifferentQuantities.INCH,22.65);
        QuantityMeasurement inch2 = new QuantityMeasurement(DifferentQuantities.INCH,22.65);
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void givenInchValue_whenComparedwithDifferentInchValue_shouldReturnNotEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(DifferentQuantities.INCH,66.9);
        QuantityMeasurement inch2 = new QuantityMeasurement(DifferentQuantities.INCH,72.5);
        Assert.assertNotEquals(inch1,inch2);
    }

    @Test
    public void givenFeetValue0_whenComparedwithInchValue0_shouldReturnEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(DifferentQuantities.INCH,0.0);
        QuantityMeasurement feet = new QuantityMeasurement(DifferentQuantities.FEET,0.0);
        Assert.assertEquals(true, QuantityMeasurement.compareQuantity(inch,feet));
    }

    @Test
    public void givenFeetValue1_whenComparedwithInchValue1_shouldReturnNotEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(DifferentQuantities.INCH,1.0);
        QuantityMeasurement feet = new QuantityMeasurement(DifferentQuantities.FEET,1.0);
        Assert.assertNotEquals(true, QuantityMeasurement.compareQuantity(inch,feet));
    }

    @Test
    public void givenFeetValue1_whenComparedwithInchValue12_shouldReturnEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(DifferentQuantities.INCH,12.0);
        QuantityMeasurement feet = new QuantityMeasurement(DifferentQuantities.FEET,1.0);
        Assert.assertEquals(true, QuantityMeasurement.compareQuantity(feet,inch));
    }

    @Test
    public void givenInchValue12_whenComparedwithFeetValue1_shouldReturnEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(DifferentQuantities.INCH,12.0);
        QuantityMeasurement feet = new QuantityMeasurement(DifferentQuantities.FEET,1.0);
        Assert.assertEquals(true, QuantityMeasurement.compareQuantity(inch,feet));
    }

    @Test
    public void givenFeetValue3_whenComparedwithYardValue1_shouldReturnEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(DifferentQuantities.FEET,3.0);
        QuantityMeasurement yard = new QuantityMeasurement(DifferentQuantities.YARD,1.0);
        Assert.assertEquals(true, QuantityMeasurement.compareQuantity(feet,yard));
    }

    @Test
    public void givenFeetValue1_whenComparedwithYardValue1_shouldReturnNotEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(DifferentQuantities.FEET,1.0);
        QuantityMeasurement yard = new QuantityMeasurement(DifferentQuantities.YARD,1.0);
        Assert.assertNotEquals(true, QuantityMeasurement.compareQuantity(feet,yard));
    }

    @Test
    public void givenYardValue1_whenComparedwithFeetValue3_shouldReturnEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(DifferentQuantities.FEET,3.0);
        QuantityMeasurement yard = new QuantityMeasurement(DifferentQuantities.YARD,1.0);
        Assert.assertEquals(true, QuantityMeasurement.compareQuantity(yard,feet));
    }

    @Test
    public void givenInchValue36_whenComparedwithYardValue1_shouldReturnEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(DifferentQuantities.INCH,36.0);
        QuantityMeasurement yard = new QuantityMeasurement(DifferentQuantities.YARD,1.0);
        Assert.assertEquals(true, DifferentQuantities.compareQuantity(inch,yard));
    }

    @Test
    public void givenInchValue96_whenComparedwithYardValue2_shouldReturnNotEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(DifferentQuantities.INCH,96.0);
        QuantityMeasurement yard = new QuantityMeasurement(DifferentQuantities.YARD,2.0);
        Assert.assertNotEquals(true, QuantityMeasurement.compareQuantity(inch,yard));
    }

    @Test
    public void givenInchValue2_whenComparedwithCentiMeterValue5_shouldReturnEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(DifferentQuantities.INCH,2.0);
        QuantityMeasurement cm = new QuantityMeasurement(DifferentQuantities.CENTIMETER,5.0);
        Assert.assertEquals(true, QuantityMeasurement.compareQuantity(inch,cm));
    }

    @Test
    public void givenInchValue1_whenComparedwithCentiMeterValue1_shouldReturnNotEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(DifferentQuantities.INCH,1.0);
        QuantityMeasurement cm = new QuantityMeasurement(DifferentQuantities.CENTIMETER,1.0);
        Assert.assertNotEquals(true, QuantityMeasurement.compareQuantity(inch,cm));
    }

    @Test
    public void givenFeetvalue1_whenComparedwithCentiMeterValue60_shouldReturnEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(DifferentQuantities.FEET,1.0);
        QuantityMeasurement cm = new QuantityMeasurement(DifferentQuantities.CENTIMETER,30.0);
        Assert.assertEquals(true, QuantityMeasurement.compareQuantity(inch,cm));
    }

    @Test
    public void givenInchvalue2_whenAddedWithInchValue2_shouldReturnEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(DifferentQuantities.INCH,2.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(DifferentQuantities.INCH,2.0);
        double addition = QuantityMeasurement.addQuantity(inch1, inch2);
        Assert.assertEquals(4.0,addition,0.0);
    }

    @Test
    public void givenFeetvalue1_whenAddedWithInchValue2_shouldReturnEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(DifferentQuantities.FEET,1.0);
        QuantityMeasurement inch = new QuantityMeasurement(DifferentQuantities.INCH,2.0);
        double addition = QuantityMeasurement.addQuantity(feet, inch);
        Assert.assertEquals(14.0,addition,0.0);
    }

    @Test
    public void givenFeetvalue1_whenAddedWithInchValue1_shouldReturnNotEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(DifferentQuantities.FEET,1.0);
        QuantityMeasurement inch = new QuantityMeasurement(DifferentQuantities.INCH,1.0);
        double addition = QuantityMeasurement.addQuantity(feet, inch);
        Assert.assertNotEquals(5.0,addition,0.0);
    }

    @Test
    public void givenFeetvalue1_whenAddedWithFeetValue1_shouldReturnEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(DifferentQuantities.FEET,1.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(DifferentQuantities.FEET,1.0);
        double addition = QuantityMeasurement.addQuantity(feet1, feet2);
        Assert.assertEquals(24.0,addition,0.0);
    }

    @Test
    public void givenInchvalue2_whenAddedWithCentiMeterValue2_5_shouldReturnEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(DifferentQuantities.INCH,2.0);
        QuantityMeasurement cm = new QuantityMeasurement(DifferentQuantities.CENTIMETER,2.5);
        double addition = DifferentQuantities.addQuantity(inch, cm);
        Assert.assertEquals(3.0,addition,0.0);
    }

    @Test
    public void givenGallonvalue1_whenComparedWithLitreValue_shouldReturnEqual() {
        QuantityMeasurement gallon = new QuantityMeasurement(DifferentQuantities.GALLON,1.0);
        QuantityMeasurement litre = new QuantityMeasurement(DifferentQuantities.LITRE,3.78);
        Assert.assertEquals(true, QuantityMeasurement.compareQuantity(gallon,litre));
    }

    @Test
    public void givenGallonvalue1_whenComparedWithLitreValue1_shouldReturnNotEqual() {
        QuantityMeasurement gallon = new QuantityMeasurement(DifferentQuantities.GALLON,1.0);
        QuantityMeasurement litre = new QuantityMeasurement(DifferentQuantities.LITRE,1.0);
        Assert.assertNotEquals(true, QuantityMeasurement.compareQuantity(gallon,litre));
    }

    @Test
    public void givenLitrevalue1_whenComparedWithMilliLitreValue1000_shouldReturnEqual() {
        QuantityMeasurement litre = new QuantityMeasurement(DifferentQuantities.LITRE,1.0);
        QuantityMeasurement milliLitre = new QuantityMeasurement(DifferentQuantities.MILLILITRE,1000.0);
        Assert.assertEquals(true, QuantityMeasurement.compareQuantity(litre,milliLitre));
    }

    @Test
    public void givenLitrevalue1_whenComparedWithMilliLitreValue1_shouldReturnNotEqual() {
        QuantityMeasurement litre = new QuantityMeasurement(DifferentQuantities.LITRE,1.0);
        QuantityMeasurement milliLitre = new QuantityMeasurement(DifferentQuantities.MILLILITRE,1.0);
        Assert.assertNotEquals(true, QuantityMeasurement.compareQuantity(litre,milliLitre));
    }

    @Test
    public void givenGallonvalue1_whenAddedWithLitresValue_shouldReturnEqual() {
        QuantityMeasurement gallon = new QuantityMeasurement(DifferentQuantities.GALLON,1.0);
        QuantityMeasurement litre = new QuantityMeasurement(DifferentQuantities.LITRE,3.78);
        double addition = QuantityMeasurement.addQuantity(gallon, litre);
        Assert.assertEquals(7.56,addition,0.0);
    }

    @Test
    public void givenGallonvalue1_whenAddedWithLitresValue1_shouldReturnNotEqual() {
        QuantityMeasurement gallon = new QuantityMeasurement(DifferentQuantities.GALLON,1.0);
        QuantityMeasurement litre = new QuantityMeasurement(DifferentQuantities.LITRE,1.0);
        double addition = QuantityMeasurement.addQuantity(gallon, litre);
        Assert.assertNotEquals(7.56,addition,0.0);
    }

    @Test
    public void givenLitrevalue1_whenAddedWithMilliLitresValue1000_shouldReturnEqual() {
        QuantityMeasurement litre = new QuantityMeasurement(DifferentQuantities.LITRE,1.0);
        QuantityMeasurement milliLitre = new QuantityMeasurement(DifferentQuantities.MILLILITRE,1000.0);
        double addition = QuantityMeasurement.addQuantity(litre, milliLitre);
        Assert.assertEquals(2.0,addition,0.0);
    }

    @Test
    public void givenLitrevalue1_whenAddedWithMilliLitresValue1_shouldReturnNotEqual() {
        QuantityMeasurement litre = new QuantityMeasurement(DifferentQuantities.LITRE,1.0);
        QuantityMeasurement milliLitre = new QuantityMeasurement(DifferentQuantities.MILLILITRE,1.0);
        double addition = QuantityMeasurement.addQuantity(litre, milliLitre);
        Assert.assertNotEquals(2.0,addition,0.0);
    }

    @Test
    public void givenKiloGramvalue1_whenComparedWithGramsValue1000_shouldReturnEqual() {
        QuantityMeasurement kiloGram = new QuantityMeasurement(DifferentQuantities.KILOGRAM,1.0);
        QuantityMeasurement gram = new QuantityMeasurement(DifferentQuantities.GRAM,1000.0);
        Assert.assertEquals(true, QuantityMeasurement.compareQuantity(kiloGram,gram));
    }

    @Test
    public void givenKiloGramvalue1_whenComparedWithGrameValue1_shouldReturnNotEqual() {
        QuantityMeasurement kiloGram = new QuantityMeasurement(DifferentQuantities.KILOGRAM,1.0);
        QuantityMeasurement gram = new QuantityMeasurement(DifferentQuantities.GRAM,1.0);
        Assert.assertNotEquals(true, QuantityMeasurement.compareQuantity(kiloGram,gram));
    }

    @Test
    public void givenTonnevalue1_whenComparedWithKiloGramsValue1000_shouldReturnEqual() {
        QuantityMeasurement tonne = new QuantityMeasurement(DifferentQuantities.TONNE,1.0);
        QuantityMeasurement kiloGram = new QuantityMeasurement(DifferentQuantities.KILOGRAM,1000.0);
        Assert.assertEquals(true, QuantityMeasurement.compareQuantity(tonne,kiloGram));
    }

    @Test
    public void givenTonnevalue1_whenComparedWithGrameValue1_shouldReturnNotEqual() {
        QuantityMeasurement tonne = new QuantityMeasurement(DifferentQuantities.TONNE,1.0);
        QuantityMeasurement gram = new QuantityMeasurement(DifferentQuantities.GRAM,1.0);
        Assert.assertNotEquals(true, QuantityMeasurement.compareQuantity(tonne,gram));
    }

    @Test
    public void givenTonnevalue1_whenAddedWithKiloGramValue1000_shouldReturnEqual() {
        QuantityMeasurement tonne = new QuantityMeasurement(DifferentQuantities.TONNE,1.0);
        QuantityMeasurement gram = new QuantityMeasurement(DifferentQuantities.GRAM,1000.0);
        double addition = QuantityMeasurement.addQuantity(tonne, gram);
        Assert.assertEquals(1001.0,addition,0.0);
    }

    @Test
    public void givenKiloGramvalue1_whenAddedWithGramValue1000_shouldReturnEqual() {
        QuantityMeasurement kiloGram = new QuantityMeasurement(DifferentQuantities.KILOGRAM,1.0);
        QuantityMeasurement gram = new QuantityMeasurement(DifferentQuantities.GRAM,1000.0);
        double addition = QuantityMeasurement.addQuantity(kiloGram, gram);
        Assert.assertEquals(2.0,addition,0.0);
    }

    @Test
    public void givenKiloGramvalue1_whenAddedWithGramValue1_shouldReturnNotEqual() {
        QuantityMeasurement kiloGram = new QuantityMeasurement(DifferentQuantities.KILOGRAM,1.0);
        QuantityMeasurement gram = new QuantityMeasurement(DifferentQuantities.GRAM,1.0);
        double addition = QuantityMeasurement.addQuantity(kiloGram, gram);
        Assert.assertNotEquals(2.0,addition,0.0);
    }

    @Test
    public void givenFarenhietvalue212_whenComparedWithCelsiusValue100_shouldReturnEqual() {
        QuantityMeasurement fahrenhiet = new QuantityMeasurement(DifferentQuantities.FAHRENHIET,212.0);
        QuantityMeasurement celsius = new QuantityMeasurement(DifferentQuantities.CELSIUS,100.0);
        boolean result = QuantityMeasurement.compareQuantity(fahrenhiet,celsius);
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenFarenhietvalue100_whenComparedWithCelsiusValue38_shouldReturnEqual() {
        QuantityMeasurement fahrenhiet = new QuantityMeasurement(DifferentQuantities.FAHRENHIET,100.4);
        QuantityMeasurement celsius = new QuantityMeasurement(DifferentQuantities.CELSIUS,38.0);
        boolean result = QuantityMeasurement.compareQuantity(fahrenhiet,celsius);
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenFarenhietvalue1_whenComparedWithCelsiusValue1_shouldReturnNotEqual() {
        QuantityMeasurement fahrenhiet = new QuantityMeasurement(DifferentQuantities.FAHRENHIET,1.0);
        QuantityMeasurement celsius = new QuantityMeasurement(DifferentQuantities.CELSIUS,1.0);
        boolean result = QuantityMeasurement.compareQuantity(fahrenhiet,celsius);
        Assert.assertNotEquals(true,result);
    }

    @Test
    public void givenCelsiusvalue100_whenComparedWithFahrienhetValue212_shouldReturnEqual() {
        QuantityMeasurement celsius = new QuantityMeasurement(DifferentQuantities.CELSIUS,100.0);
        QuantityMeasurement fahrenhiet = new QuantityMeasurement(DifferentQuantities.FAHRENHIET,212.0);
        boolean result = QuantityMeasurement.compareQuantity(celsius,fahrenhiet);
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenCelsiusValue38_whenComparedWithFahrienhietValue100_shouldReturnEqual() {
        QuantityMeasurement celsius = new QuantityMeasurement(DifferentQuantities.CELSIUS,38.0);
        QuantityMeasurement fahrenhiet = new QuantityMeasurement(DifferentQuantities.FAHRENHIET,100.4);
        boolean result = QuantityMeasurement.compareQuantity(celsius,fahrenhiet);
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenCelsiusvalue1_whenComparedWithFahrienhietValue1_shouldReturnNotEqual() {
        QuantityMeasurement celsius = new QuantityMeasurement(DifferentQuantities.CELSIUS,1.0);
        QuantityMeasurement fahrenhiet = new QuantityMeasurement(DifferentQuantities.FAHRENHIET,1.0);
        boolean result = QuantityMeasurement.compareQuantity(celsius,fahrenhiet);
        Assert.assertNotEquals(true,result);
    }

    @Test
    public void givenCelsiusvalue_whenAddedWithFahrienhietValue1_shouldThrowException() {
        try {
            QuantityMeasurement celsius = new QuantityMeasurement(DifferentQuantities.CELSIUS, 1.0);
            QuantityMeasurement fahrenhiet = new QuantityMeasurement(DifferentQuantities.FAHRENHIET, 1.0);
            QuantityMeasurement.addQuantity(celsius, fahrenhiet);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.TypeOfException.IMPROPER_QUANTITY, e.type);
        }
    }

    @Test
    public void givenLengthValue_whenAddedWithVolume_shouldThrowException() {
        try {
        QuantityMeasurement foot = new QuantityMeasurement(DifferentQuantities.FEET,5.0);
        QuantityMeasurement litre = new QuantityMeasurement(DifferentQuantities.LITRE,5.0);
        QuantityMeasurement.addQuantity(foot,litre);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.TypeOfException.IMPROPER_QUANTITY, e.type);
        }
    }

    @Test
    public void givenCelsiusvalue38_whenComparedWithCelsiusValue38_shouldReturnEqual() {
        QuantityMeasurement celsius1 = new QuantityMeasurement(DifferentQuantities.CELSIUS,38.0);
        QuantityMeasurement celsius2 = new QuantityMeasurement(DifferentQuantities.CELSIUS,38.0);
        Assert.assertEquals(celsius1,celsius2);
    }

    @Test
    public void givenFahrienhietvalue100_whenComparedWithFahrenhietValue100_shouldReturnEqual() {
        QuantityMeasurement fahrienhiet1 = new QuantityMeasurement(DifferentQuantities.FAHRENHIET,100.0);
        QuantityMeasurement fahrienhiet2 = new QuantityMeasurement(DifferentQuantities.FAHRENHIET,100.0);
        Assert.assertEquals(fahrienhiet1,fahrienhiet2);
    }

    @Test
    public void givenCelsiusValue38_whenComparedWithKelvinValue311_shouldReturnEqual() {
        QuantityMeasurement celsius = new QuantityMeasurement(DifferentQuantities.CELSIUS,38.0);
        QuantityMeasurement kelvin = new QuantityMeasurement(DifferentQuantities.KELVIN,311.15);
        boolean result = QuantityMeasurement.compareQuantity(celsius,kelvin);
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenKelvinValue311_whenComparedWithCelsiusValue38_shouldReturnEqual() {
        QuantityMeasurement kelvin = new QuantityMeasurement(DifferentQuantities.KELVIN,311.15);
        QuantityMeasurement celsius = new QuantityMeasurement(DifferentQuantities.CELSIUS,38.0);
        boolean result = QuantityMeasurement.compareQuantity(kelvin,celsius);
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenFrahrenhietValue60_whenComparedWithKelvinValue288_shouldReturnEqual() {
        QuantityMeasurement frahrenhiet = new QuantityMeasurement(DifferentQuantities.FAHRENHIET,60.0);
        QuantityMeasurement kelvin = new QuantityMeasurement(DifferentQuantities.KELVIN,288.71);
        boolean result = QuantityMeasurement.compareQuantity(frahrenhiet,kelvin);
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenKelvinValue288_whenComparedWithFrahrenhietValue60_shouldReturnEqual() {
        QuantityMeasurement kelvin = new QuantityMeasurement(DifferentQuantities.KELVIN,288.71);
        QuantityMeasurement frahrenhiet = new QuantityMeasurement(DifferentQuantities.FAHRENHIET,60.0);
        boolean result = QuantityMeasurement.compareQuantity(kelvin,frahrenhiet);
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenKelvinValue500_whenComparedWithFrahrenhietValue600_shouldReturnNotEqual() {
        QuantityMeasurement kelvin = new QuantityMeasurement(DifferentQuantities.KELVIN,500.0);
        QuantityMeasurement frahrenhiet = new QuantityMeasurement(DifferentQuantities.FAHRENHIET,600.0);
        boolean result = QuantityMeasurement.compareQuantity(kelvin,frahrenhiet);
        Assert.assertNotEquals(true,result);
    }
}
