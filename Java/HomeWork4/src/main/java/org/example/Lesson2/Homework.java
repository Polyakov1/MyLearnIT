package org.example.Lesson2;

public class Homework {

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        System.out.println(appleBox.getWeight());

        appleBox.add(new Apple(2));
        appleBox.add(new Apple(4));
        System.out.println(appleBox.getWeight());
        appleBox.add(new GoldenApple(4));
        System.out.println(appleBox.getWeight());

        Box<Orange> orangeBox = new Box<>();

        orangeBox.add(new Orange(8));
        System.out.println(orangeBox.getWeight());

        Box<GoldenApple> goldenAppleBox = new Box<>();
        goldenAppleBox.add(new GoldenApple(20));

        goldenAppleBox.move(appleBox);

        System.out.println(goldenAppleBox.getWeight());
        System.out.println(appleBox.getWeight());

/**
 orangeBox.move(appleBox); // Не должно компилироваться!!!
 appleBox.move(orangeBox); // Не должно компилироваться!!!

 Box<GoldenApple> goldenAppleBox = new Box();
 goldenAppleBox.add(new GoldenApple(20)); // Должно компилироваться
 goldenAppleBox.add(new Apple(20)); // Не должно компилироваться!!!

 appleBox.move(goldenAppleBox); // Не должно компилироваться!!!
 appleBox.add(new Orange(4)); // Не должно компилироваться!!!
 orangeBox.add(new Apple(2)); // Не должно компилироваться!!!


 */
        for (Apple apple : appleBox) {
            System.out.println(apple.getWeight());
        }

        for (GoldenApple goldenApple : goldenAppleBox) {
            System.out.println(goldenApple.getWeight());
        }

        for (Orange orange : orangeBox) {
            System.out.println(orange.getWeight());
        }

    }


}