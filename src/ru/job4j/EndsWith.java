package ru.job4j;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int in = 0; in < post.length; in++) {
            if ((post[post.length - 1] - in) != (word[word.length - 1] - in)){
                result = false;
                break;
            }
        }
        return result;
    }
}
