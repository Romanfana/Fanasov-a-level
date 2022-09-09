import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово или строку:");
        String s = sc.nextLine();
        System.out.println(palind(s));

    }

    public static boolean palind(String text) {
        text = text.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        if (text.toLowerCase().equals((new StringBuilder(text)).reverse().toString().toLowerCase()))
            System.out.println("Палиндром: " + text);
        else
            System.out.println("Не палиднром: " + text);


        return false;
    }
}