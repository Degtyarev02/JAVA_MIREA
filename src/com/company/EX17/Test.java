package com.company.EX17;

import com.company.EX3.Circle;

public class Test {
    public static void main(String[] args) {

        System.out.println("\nBook class");
        Book2 book1 = new Book2("In Search of Lost Time", 1913, "Marcel Proust");
        Book2 book2 = new Book2("Ulysses", 1904, "James Joyce");
        Book2 book3 = new Book2("One Hundred Years of Solitude", 1910, "Gabriel Garcia Marquez");
        System.out.println(book1 + "\n" + book2 + "\n" + book3);

        System.out.println(book1.getAuthor());
        System.out.println(book1.getYear());
        System.out.println(book1.getTitle());
        book1.setYear(1912);
        System.out.println(book1.getYear());

        System.out.println("\nCircle class");
        Circle2 circle = new Circle2(3, "Red", false);
        System.out.println(circle);
        System.out.println("Area = " + circle.getArea() + "\nPerimeter = " + circle.getPerimeter());
        circle.setColor("Green");
        circle.setFilled(true);
        System.out.println(circle);

        System.out.println("\nHuman class");
        Human human = new Human(25, "Josh");
        human.getHands().bendArm();
        human.getHands().handKick();
        human.getLegs().bendLeg();
        human.getLegs().legKick();

    }
}
