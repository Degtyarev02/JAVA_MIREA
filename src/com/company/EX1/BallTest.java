package com.company.EX1;

public class BallTest {
    public static void main(String[] args) {
        Ball ball1 = new Ball("Adidas", 2500);
        Ball ball2 = new Ball("Nike", 1200);
        Ball ball3 = new Ball("Puma", 999);
        System.out.println(ball1.getPrice() + " " + ball1.getModel());
        ball1.setPrice(2400);
        System.out.println(ball1.getPrice());

        ball1.kickTheBall();
        ball2.kickTheBall();
        ball3.kickTheBall();
    }
}
