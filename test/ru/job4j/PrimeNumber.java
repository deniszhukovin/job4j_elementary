package ru.job4j;

public class PrimeNumber {
    public static int calc(int finish) {
    int count = 0;
        for (int number1 = 2; number1  <= finish; number1++ ) {
        if (CheckPrimeNumber.check(number1)) {
            boolean prime = true;
            count++ ;
        }
    }
        return count;
}

    public static void main(String[] args) {
        System.out.println(calc(5));
    }
}

