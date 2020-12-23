package ru.job4j;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value ) {
        int rsl = value / 60;
        return rsl;

    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(120);
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        int in1 = 120;
        int expected1 = 2;
        int out1 = Converter.rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println(euro);
        System.out.println(dollar);
        System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println("120 rubles are 2. Test result : " + passed1);
    }

}

