package ru.job4j;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
            for (int in = 0; in < pref.length; in++) {
                if (pref[in] != word[in]) {
                    result = false;
                    break;
                }
            }

        return result;
    }
}

