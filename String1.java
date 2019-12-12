import java.util.Scanner;
public class String1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        char[] mass = {'a', 'e', 'i', 'o', 'u', 'y'};
        String[] words = a.split("\\W");
        int ourWords = 0;
        for(String word : words) {
            System.out.println(word);
            if (word.length() == 0)
                continue;
            for(char corrWords : mass) {
                if(word.charAt(0) == corrWords) {
                    ourWords++;
                }
            }
        }
        System.out.println(ourWords);
    }
}
