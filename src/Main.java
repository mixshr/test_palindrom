import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите строку для анализа: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String string = reader.readLine();

        if (isPalindrom(string)) {
            System.out.println("Это палиндром!");
        } else {
            System.out.println("Это не палиндром!");
        }

    }

    static boolean isPalindrom(String string) {
        if (string == null || string.isEmpty()) {
            return false;
        }

        char[] chars = string.toCharArray();
        int end = string.length() - 1;
        int start = 0;
        boolean isPalindrome;
        while (end >= 0) {
            if (!Character.isLetter(chars[end])) {
                end--;
                continue;
            }

            if (!Character.isLetter(chars[start])) {
                start++;
                continue;
            }

            isPalindrome = chars[end] == chars[start];

            if (!isPalindrome) {
                return false;
            }

            end--;
            start++;
        }

        return true;
    }
}