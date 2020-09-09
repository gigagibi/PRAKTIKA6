package com.company;

public class Square extends Shape {
    private float side;

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    @Override
    public float getArea() {
        return side * side;
    }
}
