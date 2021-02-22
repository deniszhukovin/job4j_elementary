package ru.job4j;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
       for (int ind = 0; ind < data.length;ind++) {
           if (data[0] != data[ind]){
               result = false;
               break;
           }
       }
        return result;
    }
}
