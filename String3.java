import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        String[] words = a.split("\\W");
        String maxWord = words[0];
        for(String word : words) {
            if(word.length() >= maxWord.length()) {
                maxWord = word;
            }
        }
        System.out.println(maxWord);
    }
}