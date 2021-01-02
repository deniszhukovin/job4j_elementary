package ru.job4j;

public class Helllloooo {
    public static String checkNumber(int number) {
        if  ((number % 3 == 0) && (number % 5 == 0)) {
            return " Hello World!!!";
        }
        if (number % 3 == 0) {
            return "Hello";
        }
        if ( number % 5 == 0) {
            return "World";
        }
        return " Operation not support";
        }

    public static void main(String[] args) {
        System.out.println(Helllloooo.checkNumber(351));
    }
}
