package ru.mirea.lab3.math.ex2;
class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}
