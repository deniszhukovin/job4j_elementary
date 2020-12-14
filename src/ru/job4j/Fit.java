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
        short height = 2 ;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height);
        System.out.println( man);
        System.out.println(woman);
    }

}

