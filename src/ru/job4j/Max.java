package ru.job4j;

public class Max {
    public static int max(int left, int right) {
        boolean condition = left > right;
        int result = condition ? left : right;
        return result;
    }
    public static void main(String[] args) {
       int result = Max.max(22, 882);
        System.out.println(result);
    }


}
