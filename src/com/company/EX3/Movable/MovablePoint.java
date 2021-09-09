package com.company.EX3.Movable;

public class MovablePoint implements Movable{
    protected int x = 0;
    protected int y = 0;
    protected int xSpeed = 1;
    protected int ySpeed = 1;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        this.y += this.ySpeed;
    }

    @Override
    public void moveDown() {
        this.y -= this.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x -= this.xSpeed;
    }

    @Override
    public void moveRight() {
        this.x += this.xSpeed;
    }

    @Override
    public String toString() {
        return "movablePoint { " +
                " x = " + x +
                ", y = " + y +
                ", xSpeed = " + xSpeed +
                ", ySpeed = " + ySpeed +
                " } " ;
    }
}
