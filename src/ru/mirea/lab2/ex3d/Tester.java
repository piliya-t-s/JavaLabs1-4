package ru.mirea.lab2.ex3d;

public class Tester {
    public static void main(String[] args) {
        Circle circle = new Circle();

        Point center1 = new Point(1, 1);
        circle.setCenter(center1);
        circle.setDiameter(2);
        System.out.println(circle);

        Point center2 = new Point(10, 10);
        circle.setCenter(center2);
        System.out.println(circle);

        circle.move(3, 4);
        System.out.println(circle);
    }
}
