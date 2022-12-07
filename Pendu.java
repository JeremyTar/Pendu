import java.util.Scanner;
//programme en java
public class Pendu{
    private static char[] getCaractere() {
        //Dictionnaire de mot
        final String[] Dictionary = {"Chocolat","Science","Informatique","Musique","Geologie","Gastronomie"};
        //Choix d'un mot dans le dictionnaire
        String Word = Dictionary[(int) Math.round(Math.random() * (Dictionary.length - 1))];
        //WordSplit contient les lettres du mot choisit
        char[] WordSplit = Word.toCharArray();
        //Pour chaque lettre, le mettre en majuscule
        for(int i = 0; i < WordSplit.length; ++i) {
            WordSplit[i] = Character.toUpperCase(WordSplit[i]);
        }
        //A enlever
        System.out.println(WordSplit);
        return WordSplit;
    };

    public static void main(String[] args) {
        //Vie
        int vie = 10;
        //Choix du mot avec la fonction getCaractere();
        char[] word = getCaractere();
        //Wordlength
        int Wordlength = word.length;
        //Cache le mot avec des "X"
        char[] userArray = new char[Wordlength];
        for(int i = 0; i < Wordlength; ++i) {
            userArray[i] = 'X';
        };

        while( vie > 0 && userArray != word) {
            System.out.println("Choose a letter : ");
            Scanner in = new Scanner(System.in);
            char userLetter = in.next().charAt(0);
            userLetter = Character.toUpperCase(userLetter);
            for(int i = 0; i < Wordlength; ++i) {
                if(userLetter == word[i]) {
                    userArray[i] = userLetter;
                }
            };
            System.out.println(userArray);
            System.out.println(word);
            --vie;
            System.out.println(vie);
        }
        
        System.out.println("You loose");
    };
}; 