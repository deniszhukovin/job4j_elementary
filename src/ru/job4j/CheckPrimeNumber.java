package ru.job4j;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int ind = 2; ind < (number - 1); ind++) {
             if (number % ind == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        System.out.println(check(2));
    }
}










