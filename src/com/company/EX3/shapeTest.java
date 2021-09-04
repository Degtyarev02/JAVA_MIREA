package com.company.EX3;

public class shapeTest {
    public static void main(String[] args) {
        Shape fig1 = new Circle(10, "GREEN", false);
        System.out.println(fig1);
        System.out.println(fig1.getArea());
        System.out.println(fig1.getPerimeter());
        System.out.println(fig1.getColor());
        /*System.out.println(fig1.getRadius()); - ошибка компиляции, так как у класса ссылки на объект нет этого метода*/

        Circle cir1 = (Circle)fig1;
        System.out.println(cir1);
        System.out.println(cir1.getArea());
        System.out.println(cir1.getPerimeter());
        System.out.println(cir1.getColor());
        System.out.println(cir1.getRadius()); //Ссылка класса Circle имеет метод getRadius

        /*Shape fig2 = new Shape(); - ошибка, объект абстрактного класса не может существовать*/
        Shape fig2 = new Rectangle(1.0, 2.0, "BLUE", false);
        System.out.println(fig2);
        System.out.println(fig2.getArea());
        System.out.println(fig2.getPerimeter());
        System.out.println(fig2.getColor());
        /*System.out.println(fig2.getLength()); класс shape не имеет этого геттера*/
        Rectangle r1 = (Rectangle)fig2;

        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        Shape s4 = new Square(6.6);

        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        /*System.out.println(s4.getSide()); то же самое*/

        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
       /* System.out.println(r2.getSide()); класс Rectangle не имеет метода getSide*/
        System.out.println(r2.getLength());

        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

    }
}
