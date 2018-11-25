package com.oop_pub.junit.ex2;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;


public class GeometricFormsTest {

    private List<GeometricForms> geomForm;

    @org.junit.Before
    public void setUp() {
        geomForm = new ArrayList<>();

        geomForm.add(new GeometricForms(Forms.CIRCLE.toString()));
        geomForm.add(new GeometricForms(Forms.RECTANGLE.toString()));
        geomForm.add(new GeometricForms(Forms.TRIANGLE.toString()));
    }

    @org.junit.Test
    public void testIsCircle() {
        Assert.assertTrue(geomForm.get(0).isCircle());
        Assert.assertFalse(geomForm.get(1).isCircle());
        Assert.assertFalse(geomForm.get(2).isCircle());
    }

    @org.junit.Test
    public void testIsRectangle() {
        Assert.assertFalse(geomForm.get(0).isRectangle());
        Assert.assertTrue(geomForm.get(1).isRectangle());
        Assert.assertFalse(geomForm.get(2).isRectangle());
    }

    @org.junit.Test
    public void testIsTriangle() {
        Assert.assertFalse(geomForm.get(0).isTriangle());
        Assert.assertFalse(geomForm.get(1).isTriangle());
        Assert.assertTrue(geomForm.get(2).isTriangle());
    }

}
