package com.company.EX17;

public class Human {
    private int age;
    private String name;
    private Head head;
    private Hands hands;
    private Legs legs;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.head = new Head();
        this.hands = new Hands();
        this.legs = new Legs();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Head getHead() {
        return head;
    }

    public Hands getHands() {
        return hands;
    }

    public Legs getLegs() {
        return legs;
    }

    public static class Head{
        public void rotateHead(){
            System.out.println("Голова повернута");
        }
    }

    public static class Hands {
        public void bendArm() {
            System.out.println("Рука согнута");
        }
        public void handKick() {
            System.out.println("Удар рукой");
        }

    }
    public static class Legs {
        public void bendLeg() {
            System.out.println("Нога согнута");
        }
        public void legKick() {
            System.out.println("Удар ногой");
        }
    }

}
