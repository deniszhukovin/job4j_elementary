package ru.job4j;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = " Денис Жуковин";
        names[1] = "Happy new year!";
        names[2] = "java";
        names[3] = "job4j";
        System.out.println("размер массива равен :" + ages.length);
        System.out.println("размер массива равен :" + surnames.length);
        System.out.println("размер массива равен :" + prices.length);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
