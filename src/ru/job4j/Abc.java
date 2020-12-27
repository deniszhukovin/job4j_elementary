package ru.job4j;

public class Abc {
    public static int sr(int a, int b, int c) {
        int rsl = c;
        if (a > b) {
            rsl = a;
        } else if (a > c) {
            rsl = a;
        } else if (b > c) {
            rsl = b;
        } else {
            System.out.println(rsl);
        }
        return rsl;
    }
    public  static void main (String[] args) {
        Abc.sr(12, 45, 67);
       }
    }

