package ru.job4j;

public class MathFunc {
    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }
    public static void main(String[] args) {
        int y = MathFunc.func1(100);
        int total = y;
        System.out.println(total);
    }
}
