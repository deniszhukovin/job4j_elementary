package ru.job4j;

public class PrimeNumber {
    public static int calc(int finish) {
    int count = 0;
        for (int number = 2; number  <= finish; number++ ) {
        if (CheckPrimeNumber.check(number)) {
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

