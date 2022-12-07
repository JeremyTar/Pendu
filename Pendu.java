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
        //Variable de verification de la taille du mot qu'on est en train de trouver
        int verif = 0;
        //Choix du mot avec la fonction getCaractere();
        char[] word = getCaractere();
        //Wordlength
        int Wordlength = word.length;
        //Vie
        int vie = Wordlength + 10;
        //Cache le mot avec des "X"
        char[] userArray = new char[Wordlength];


        for(int i = 0; i < Wordlength; ++i) {
            userArray[i] = 'X';
        };

        while( vie > 0 ) {
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
            //System.out.println(word);
            --vie;
            System.out.println("Vous avez "+vie+" chances !!!");

            for(int i = 0; i < Wordlength; i++) {
                if(userArray[i] == word[i]) {
                    verif ++;
                    //System.out.println(verif);
                }
            };

            if (verif==Wordlength){
                System.out.println("You WIN");
                System.exit(-1);
            }
        }
        System.out.println("You loose");
    };
}; 