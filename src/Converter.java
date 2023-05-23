public class Converter {
    public static String convertArabToRoman(int number) {
        int[] arab = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder endRoman = new StringBuilder();
        for (int i = 0; i < roman.length; i++) {
            while (number >= arab[i]) {
                number -= arab[i];
                endRoman.append(roman[i]);
            }
        }
        return endRoman.toString();
    }
}
