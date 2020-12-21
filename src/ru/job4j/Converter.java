package ru.job4j;

public class Converter {
    public static double rubleToEuro(double value, double cfe) {
        double rsl = value / cfe;
        return rsl;
    }

    public static double rubleToDollar(double value, double cfd) {
        double rsl = value / cfd;
        return rsl;
    }

    public static void main(String[] args) {
        double euro = Converter.rubleToEuro(140, 70);
        double dollar = Converter.rubleToDollar(120, 60);
        int in = 140;
        int expected = 2;
        int out = (int) euro;
        boolean passed = expected == out;
        int in1 = 120;
        int expected1 = 2;
        int out1 = (int) dollar;
        boolean passed2 = expected == out;
        System.out.println(euro);
        System.out.println(dollar);
        System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println("120 rubles are 2. Test result : " + passed2);
    }

}

