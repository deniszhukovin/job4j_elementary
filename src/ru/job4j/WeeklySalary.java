package ru.job4j;

public class WeeklySalary {
    public static int calculate(int d1, int d2, int d3, int d4, int d5, int d6, int d7) {
        int s = 10, s1 = 15, s2 = s * 2, s3 = s2 * 2;
        int zp = 0, zp1 = 0, zp2 = 0, zp3 = 0, zp4 = 0, zp5 = 0, zp6 = 0, zp7 = 0;
        if (d1 <= 8) {
            zp1 = d1 * s;
        }
        if (d1 > 8) {
          zp1 =  (d1 - 8) * s1 + 8 * s;
        }
        if (d2 <= 8) {
            zp2 = d2 * s;
        }
        if (d2 > 8) {
            zp2 = (d2 - 8) * s1 + 8 * s;
        }
        if (d3 <= 8) {
            zp3 = d3 * s;
        }
        if (d3 > 8) {
            zp3 = (d3 - 8) * s1 + 8 * s;
        }
        if (d4 <= 8) {
            zp4 = d3 * s;
        }
        if (d4 > 8) {
            zp4 = (d4 - 8) * s1 + 8 * s;
        }
        if (d5 <= 8) { zp5 = d5 * s;
        }
        if (d5 > 8) {
            zp5 = (d5 - 8) * s1 + 8 * s;
        }
        if (d6 <= 8) {
            zp6 = d6 * s;
        }
        if (d6 > 8) {
            zp6 = (d6 - 8) * s1 + 8 * s;
        }
        if (d7 <= 8) {
            zp7 = d7 * s;
        }
        if (d7 > 8) {
            zp7 = (d7 - 8) * s1 + 8 * s;
        }
        return zp = zp1 + zp2 + zp3 + zp4 + zp5 + zp6 + zp7;
    }
    public static void main (String[]args){
        System.out.println(WeeklySalary.calculate(8, 8, 8, 8, 8, 0, 0));
    }
}




