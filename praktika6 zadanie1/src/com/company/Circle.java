package com.company;

public class Circle extends Shape {
    private float radius;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return 3.14f * this.radius * this.radius;
    }
}
