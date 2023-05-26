import java.util.Scanner;

public class Calculator {

    static String[] read(String inString) throws ScanerException {   // Принимаем входящую строку
        String[] words = inString.split(" ");

        if (words.length != 3) { // Проверка длины
            throw new ScanerException("ОШИБКА. Выражение должно иметь вид: 'a + b', разделенные пробелом...");
        }
        return words;
    }

    static int[] check(String[] words) throws Exception {   // Проверка чисел

        int num1;
        int num2;
        char operator = words[1].charAt(0);
        try {
            num1 = Integer.parseInt(words[0]);   // класс обертка
            num2 = Integer.parseInt(words[2]);
        } catch (NumberFormatException e) {
            throw new Exception("Cтрока не является математической операцией ");
        }
        if (num1 > 10 || num1 < 1) {
            throw new ScanerException("ОШИБКА. Число 'a' больше 10 или меньше 1, введите заново");
        }
        if (num2 > 10 || num2 < 1) {
            throw new ScanerException("ОШИБКА. Число 'b' больше 10 или меньше 1, введите заново");
        }
        return new int[]{num1, num2, operator};
    }

}







