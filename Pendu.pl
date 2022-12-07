#!usr/bin/perl
my @dictionary = ("Chocolat","Science","Informatique","Musique","Geologie","Gastronomie");
my $victory = 0;
my $userSelect

sub getOneWord(tableau) {
    my $randNbr = rand(length(tableau))
    my $myWord = tableau[$randNbr]
    my @myWordSplit.split("", $myWord)

    for( my $i = 0; $i < length(@myWordSplit) ; $i++) {
        @myWordSplit[$i] = @myWordSplit[$i].uc()
    }
    return @myWordSplit
}

sub buildUserArray(wordArray) {
    my @ArrayUser = []
    for(my $i = 0; i < length(wordArray); $i++) {
        push @ArrayUser, 'X'
    }
    print "@ArrayUser"
}


#Tableau et Tableau associatif

my @tab1 = ("hello", 3, $a); #tableau simple
my %tab2 = (
    "insert1" => "hello"
    "insert2" => 3
)
my @tabMap = (2,3,4,5,6)
my @tabMapSort = map( { $_* = 2} @tabMap) #multiplie tous les elements de @tapMap par deux

#les conditions if, while,  

if ($a == 1) {
    print "Je suis egal"
} else {
    print "Je ne suis pas égal"
}

print "Comparaison ok" if(defined($a))

while ($a =< 10) {
    print "Encore un !"
    $a++
}




