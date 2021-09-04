package com.company.EX3.Movable;

public class MovableCircle implements Movable{

    private int Radius;
    private MovablePoint center;

    public MovableCircle(int radius) {
        Radius = radius;
        this.center = new MovablePoint(0, 0, 1, 1);
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "Radius=" + Radius +
                ", center=" + center +
                '}';
    }
}
