package ru.job4j;

public class Priz {
    public static int checkGame(int percent, int prize, int pay) {
        if ((percent * prize) > pay) {
            return percent * prize - pay;
        } else if ((percent * prize - pay) <= 0) {
          return 0;
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(Priz.checkGame(3,5,48));
    }
}
