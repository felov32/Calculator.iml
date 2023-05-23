public class Result {
    public static int calc(int number1, int number2, char operator) {
        int result = 0;
        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                System.out.println("Некорректная математическая операция");
        }
        return result;
    }

    static String answer(int result) throws Exception { // Вывод ответа
        if (Calculator.isRome & result < 1) {
            throw new Exception("В римской системе нет отрицательных чисел");
        }
        if (Calculator.isRome) {
            System.out.println("Ответ " + Converter.convertArabToRoman(result));
        } else {
            System.out.println("Ответ: "  + result);
        }
        return null;
    }
}
