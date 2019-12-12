import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int wordNumber = 0;
        boolean inWord = false;
        int letterC = 0;
        for(int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if(Character.isLetter(ch)) {
                if (inWord) {
                    letterC++;
                }
                else {
                    inWord = true;
                    letterC = 1;
                    wordNumber++;
                }
            }
            else if (inWord) {
                inWord = false;
                if (letterC == 3){
                    System.out.println(wordNumber);
                }
            }
        }
    }
}