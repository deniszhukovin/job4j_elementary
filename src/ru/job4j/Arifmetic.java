package ru.job4j;

public class Arifmetic {
    public static String selectAction(int left, int right, int rsl) {
        String res = "none";
        if (left + right == rsl) {
            res = "added";
        }
        if ((left - right == rsl)&&(right - left == rsl)) {
            res = "subtracted";
        }
        if (right * left == rsl) {
            res = "multiplied";
        }
        if ((right / left == rsl)||(left / right == rsl)) {
            res = "divided";
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(Arifmetic.selectAction(80, 45,125));
    }
}
