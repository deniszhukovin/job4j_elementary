package ru.job4j;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if ((second > third) && (second > first)) {
            result = second;
            System.out.println(result);

        } else if (third > first) {
            result = third;
            System.out.println(result);

        }
        return result;
    }
    public static void main(String[] args) {
        MultiMax.max(755, 755, 158);
    }
}


