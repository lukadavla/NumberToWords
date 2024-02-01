public class NumberToWords {
    public static void main(String[] args) {
        int number = 3;
        String word = numberToWords(number);
        System.out.println(word);
    }

    public static String numberToWords(int number) {
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        if (number >= 0 && number <= 9) {
            return words[number];
        } else {
            return "wrong input. please provide a number between 0 and 9.";
        }
    }
}
