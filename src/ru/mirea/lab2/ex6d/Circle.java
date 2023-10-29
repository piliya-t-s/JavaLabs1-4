package ru.mirea.lab2.ex6d;
import java.util.Objects;

public class Circle {
    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(){
        this.x = 0.0;
        this.y = 0.0;
        this.radius = 1.0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.getRadius()*this.getRadius()*Math.PI;
    }

    public double getLength() {
        return 2*Math.PI*this.getRadius();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(getX(), circle.getX()) == 0 && Double.compare(getY(), circle.getY()) == 0 && Double.compare(getRadius(), circle.getRadius()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), getRadius());
    }
}
