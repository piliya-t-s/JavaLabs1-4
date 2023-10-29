package ru.mirea.lab2.ex6d;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2, 2, 3);
        Circle circle2 = new Circle(0, 0, 3);
        System.out.println(circle1.equals(circle2));

        circle2.setX(2);
        circle2.setY(2);
        System.out.println(circle1.equals(circle2));

        System.out.println(circle1.getArea());
        System.out.println(circle1.getLength());
    }
}
