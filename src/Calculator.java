import java.util.Scanner;

public class Calculator {
    static boolean isRome = false;

    static String[] read(String inString) throws ScanerException {   // Принимаем входящую строку
//        System.out.println("Введиде выряжение для решения, формат 'a + b', через пробел.Допускаются числа от 1 до 10 или от I до X включительно:");
//        String stringIn = new Scanner(System.in).nextLine().trim();

        String[] words = inString.split(" ");

        if (words.length != 3) { // Проверка длины
            throw new ScanerException("ОШИБКА. Выражение должно иметь вид: 'a + b', разделенные пробелом...");
        }
        return words;
    }
    static int[] check(String[] words) throws Exception {   // Проверка числа арабские или римские

        int num1;
        int num2;
        char operator = words[1].charAt(0);
        try {
            num1 = TypeNum.valueOf(words[0]).getRome();
            num2 = TypeNum.valueOf(words[2]).getRome();
            isRome = true;
        } catch (IllegalArgumentException e) {
            try {
                num1 = Integer.parseInt(words[0]);
                num2 = Integer.parseInt(words[2]);
            } catch (NumberFormatException e2) {
                throw new Exception("Используются одновременно разные системы счисления ");
            }
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




