import java.util.Scanner;

public class Pendu{
    private static char[] getCractere() {
        final String[] Dictionary = {"Chocolat","Science","Informatique","Musique","Geologie","Gastronomie"};
        String Word = Dictionary[(int) Math.round(Math.random() * (Dictionary.length - 1))];
        char[] WordSplit = Word.toCharArray();
        for(int i = 0; i < WordSplit.length; ++i) {
            WordSplit[i] = Character.toUpperCase(WordSplit[i]);
        }
        System.out.println(WordSplit);
        return WordSplit;
    };
    public static void main(String[] args) {
        int vie = 10;
        char[] word = getCractere();
        char[] userArray = new char[word.length];
        for(int i = 0; i < word.length; ++i) {
            userArray[i] = 'X';
        };
        do {
            System.out.println("Choose a letter : ");
            Scanner in = new Scanner(System.in);
            char userLetter = in.next().charAt(0);
            userLetter = Character.toUpperCase(userLetter);
            for(int i = 0; i < word.length; ++i) {
                if(userLetter == word[i]) {
                    userArray[i] = userLetter;
                }
            };
            System.out.println(userArray);
            System.out.println(word);
            --vie;
            System.out.println(vie);
        }
        while( vie > 0 && userArray != word);
        System.out.println("You loose");
    };
}; 