package ru.job4j.oop;

public class DummyDic {

    String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        String eng = dic.engToRus("Cat");
        System.out.println(eng);
    }
}
