package ru.job4j;

public class Fit {

    public static double manWeight(short height) {
        double rsl = (190-100)*1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (160-110)*1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short heightMan = 190;
        short heightWoman = 190;
        double man = Fit.manWeight(heightMan);
        double woman = Fit.womanWeight(heightWoman);
        System.out.println( man);
        System.out.println(woman);
    }

}

