package ru.job4j;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1, 8, 15, 22:
                name = "понедельник";
                break;
            case 2:
                name = "вторник";
                break;
            case 3:
                name = "среда";
                break;
            case 4:
                name = "четверг";
                break;
            case 5:
                name = "пятница";
                break;
            case 6:
                name = "суббота";
                break;
            case 7:
                name = "воскресенье";
                break;
            default:
                name = "ошибка";
                System.out.println(day);
        }
        return name;
    }
    static public void main(String[] args) {
        System.out.println(SwitchWeek.nameOfDay(252));
    }
}
