#include<stdio.h>
/*  
   Compare 2 chaines et renvoie 1 si elles sont identiques, sinon 0
   Prend 2 chaines de caractères en entrée
   Compare les chaines, lettres par lettres
*/
int ComparerChaine (char ch1[], char ch2[]){
    int i=0, test=1;
    while (ch1[i] && ch2[i] && test){
        if (ch1[i++] != ch2[i++]){
            test=0;
        } 
    }
    return test;
}
/*  
   Renvoie 1 si la lettre est contenue dans le mot, sinon renvoie 0
   Prend en entrée une chaine de caractères et une lettre
   Compare le mot lettre a lettre avec la lettre
*/
int TestLettre (char mot[], char lettre[]){
    int i=0, test=0;
    while (mot[i]){
        if (mot[i++] == lettre[0]){
            test=1;
        } 
    }
    return test;
}
/*  
   Affichage du mot incomplet, renvoie 1 si le mot est complet, sinon 0
   On lui envoie le mot a trouver, et la chaine contenant les caracteres
   deja trouvés.
   Compare le mot lettre a lettre avec la chaine contenant les lettres
   trouvées, affiche le caractere si il est dans cette chaine, affiche
   un underscore et met la variable WIN a 0 sinon
*/
int Affichage (char mot[], char trouves[]){
    int i=-1, win=1;
    while (mot[++i]){
        if (TestLettre(trouves,&mot[i])==1){
            printf("%c ",mot[i]);
        }
        else {
            printf("_ " );
            win=0;
        } 
    }
    return win;
}
/*  
   Boucle principale :
   Demande un mot qu'il faudra ensuite deviner
   Tant que la chaine entrée != quit et que Affichage ne
   renvoie pas 1 :
   Demande un caractere ou la chaine 'quit'
   /!\ pas de protection pour limiter les autres
   chaines possible, bugs a prevoir /!\
   Si la lettre appartient au mot, l'ajouter dans la chaine
   des lettres trouvées
   Incrementer le nombre d'essais
   Afficher le score quand la boucle principale est terminée
*/
main(){
    char mot[30], lettre[2]=" ", trouves[30]=" ";
    int essais=0, n=0;
    printf("\n\nEntrez un mot a retrouver\n\n" );
    scanf("%s",mot);
    printf("\n\n" );
    while ((ComparerChaine(lettre, "quit" ) != 1) && (Affichage(mot, trouves) != 1)){
        printf("\n\n\nEntrez une lettre ou 'quit' pour quitter\n" );
        scanf("%s",lettre);
        printf("\n\n" );
        if (TestLettre(mot,lettre)){
            trouves[n++]=lettre[0]
            essais++;
        }
    }
    printf("\n\n%d essais\n",essais);
    return 0;
}