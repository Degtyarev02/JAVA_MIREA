package com.company.EX3.Movable;

public class TestMovable {
    public static void main(String[] args) {
        try {
            MovableRectangle movableRectangle = new MovableRectangle(0, 3, 0, 3, 1, 1 );
            movableRectangle.moveUp();
            movableRectangle.moveRight();
            System.out.println(movableRectangle);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
