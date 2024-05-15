package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        switch (position) {
            case 1 -> System.out.println("Пусть бегут неуклюже");
            case 2 -> System.out.println("Спокойной ночи");
            default -> System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox demo = new Jukebox();
        demo.music(1);
        demo.music(2);
        demo.music(3);
        demo.music(4);
        demo.music(5);
    }
}
