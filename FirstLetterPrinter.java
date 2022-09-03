import java.util.Scanner;

class FirstLetterPrinter {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in .nextLine();
        System.out.println(firstLetterPrinter(input));
    }

    static String firstLetterPrinter(String str) {
        String[] words = str.split("[\\s']");
        String result = new String();
        for (int i = 0; i < words.length; i++) {
            result = result + words[i].charAt(0);
        }
        return result;
    }
}