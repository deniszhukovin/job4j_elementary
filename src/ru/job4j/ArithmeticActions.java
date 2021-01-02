package ru.job4j;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {

        if (left + right == rsl) {
            return "added";
        }
        if ((left - right == rsl) && (right - left == rsl)) {
            return "subtracted";
        }
        if (right * left == rsl) {
            return "multiplied";
        }
        if ((right / left == rsl) || (left / right == rsl)) {
            return "divided";
        } else {
            return "none";

        }
    }

    public static void main(String[] args) {
        System.out.println(Arifmetic.selectAction(5, 10, 15));
    }
}
