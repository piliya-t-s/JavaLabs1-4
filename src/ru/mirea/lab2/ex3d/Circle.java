package ru.mirea.lab2.ex3d;

public class Circle {
    private Point center;
    private double diameter;

    public Circle(Point center, double diameter) {
        this.center = center;
        this.diameter = diameter;
    }

    public Circle() {
        this.center = new Point();
        this.diameter = 0;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void move(double x, double y) {
        this.center.move(x, y);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", diameter=" + diameter +
                '}';
    }
}
