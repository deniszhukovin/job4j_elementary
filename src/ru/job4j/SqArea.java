package ru.job4j;

public class SqArea {
   public static double sqarea(double p, double k) {
     double h = p / (2 * (k + 1));
     double l = h * k;
     double s = l * h;
     return s;
}
   public static void main(String[] args) {
     double s = SqArea.sqarea(6,2);
     System.out.println(s);
   }
}