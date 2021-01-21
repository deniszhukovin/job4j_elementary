package ru.job4j;

public class Mortgage {
    public static int year(double amount, int salary, double percent) { // int amount будет в методе с потерей данных//
        int year = 0;
        while (amount >= 0) {
            amount = amount + amount * percent / 100 - salary; // процент нужно иначе вычислять?//
            System.out.println(year);
            year++;
        }
            return year;
        }
        public static void main(String[] args) { Mortgage.year(100000, 70000, 15); }


}
