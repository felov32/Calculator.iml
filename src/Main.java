import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Введиде выряжение для решения, формат 'a + b', через пробел.Допускаются числа от 1 до 10 включительно:");
        String stringIn = new Scanner(System.in).nextLine().trim();
        calc(stringIn);
        System.out.println(calc(stringIn));
    }

    public static String calc(String input) throws Exception {

        String[] inputs = Calculator.read(input);
        int[] num = Calculator.check(inputs);
        int result = Result.calc(num[0], num[1], (char) num[2]);
        return String.valueOf(result);

    }

}

