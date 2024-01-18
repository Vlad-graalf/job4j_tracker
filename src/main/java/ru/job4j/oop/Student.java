package ru.job4j.oop;

public class Student {

    public void music(String lyrics) {
        System.out.println("I believe I can fly" + lyrics);
    }

    public void music() {
        System.out.println("Tra tra tra");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        String song = "I believe, I can fly";
        petya.music(song);
    }
}
