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

}
