package ru.mirea.lab2.ex2d;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();

        System.out.println(ball);

        ball.setX(5);

        System.out.println(ball);

        ball.move(-2, -2);

        System.out.println(ball);
    }
}
