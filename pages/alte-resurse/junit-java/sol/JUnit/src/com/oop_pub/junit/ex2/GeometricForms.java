package com.oop_pub.junit.ex2;

public class GeometricForms {
    private String name;

    public GeometricForms(final String newName) {
        this.name = newName;
    }

    public boolean isTriangle() {
        return this.name == Forms.TRIANGLE.name();
    }

    public boolean isCircle() {
        return this.name == Forms.CIRCLE.name();
    }

    public boolean isRectangle() {
        return this.name == Forms.RECTANGLE.name();
    }
}
