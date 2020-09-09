package com.company;

public abstract class Shape {
    private int x, y;

    public void setPosition(int X, int Y)
    {
        x = X;
        y = Y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public abstract float getArea();
}
