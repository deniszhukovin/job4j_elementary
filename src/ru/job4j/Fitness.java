package ru.job4j;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;

        while (ivan <= nik ) {
            ivan *= 3;
            nik *= 2;
            System.out.println(month);
            month++;
        }
        return month;
    }
   public static void main(String[] args) {
        Fitness.calc(10, 100);
    }
}

