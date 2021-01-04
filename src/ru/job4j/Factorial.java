package ru.job4j;

public class Factorial {
    public static int calc(int n) {
        int result = 1; // при значении 0 первая итерация цикла равна 0, или я не прав?
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
