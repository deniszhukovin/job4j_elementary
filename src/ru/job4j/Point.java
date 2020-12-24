package ru.job4j;

public class Point {
    public static double distance(int x1, int x2, int y1, int y2) {
        double rslFunc1 = x2 - x1;
        double rslFunc2 = y2 - y1;
        double first = Math.pow(rslFunc1, 2);
        double second = Math.pow(rslFunc2, 2);
        double rslFunc = first  + second;
        double distance = Math.sqrt(rslFunc);
        return distance;
    }

    public static void main(String[] args) {
        double distance = Point.distance(13, 7, 12, 29);
        System.out.println(distance);
    }

}
