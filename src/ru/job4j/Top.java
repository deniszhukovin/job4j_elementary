package ru.job4j;

public class Top {
    public static int mult(int a, int b) {
        int num = a;
        for (int i = 1; i <= b; i++) {
            i = a * i;
        }
        return num;
    }
    public static void main(String[] args) {
        System.out.println(mult(3,3));
    }
}
















