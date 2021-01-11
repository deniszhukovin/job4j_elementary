package ru.job4j;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;

        while (month < (nik - ivan)) {
            System.out.println(month);
            ivan *= 3;
            nik *= 2;
            month += 1;
        }
        return month;
    }
   public static void main(String[] args) {
        Fitness.calc(90, 100);
    }
}

