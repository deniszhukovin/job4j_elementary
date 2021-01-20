package ru.job4j;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("размер массива равен :" + ages.length);
        System.out.println("размер массива равен :" + surnames.length);
        System.out.println("размер массива равен :" + prices.length);
    }
}
