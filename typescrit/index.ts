let dictionary: String[] = ["Chocolat","Science","Informatique","Musique","Geologie","Gastronomie"];
let find: Boolean
let userSelect: String | null

// Function to take a word randomly
function getOneWord(table: String[]): String[] {
    const myWord: String = dictionary[Math.floor(Math.random() * table.length)]
    const myArray: String[] = myWord.split("")
    for(let i = 0; i < myArray.length; i++) {
        myArray[i] = myArray[i].toUpperCase()
    }
    return myArray
}

// build array user with "X"
function buildUserArray(wordArray: String[]): String[] {
    let ArrayUser: String[] = []
    for(let i = 0; i < wordArray.length; i++) {
        ArrayUser.push("X")
    }
    return ArrayUser
}

// RUN the game
function letsgame(): void {
    const myWordSplit: String[] = getOneWord(dictionary)
    let ArrayUser: String[] = buildUserArray(myWordSplit)
    while(find == false) {
        if(myWordSplit == ArrayUser) {
            find = true
            console.log("the winner is !")
        }
        console.log("choose a letter")
        let userInput: String | null = prompt()
        if(userInput != null) {
            userInput = userInput.toUpperCase()
           while(userInput.length > 1) {
            console.log("Nous vous demandons une seule lettre")
            userInput = userInput.toUpperCase()
        }
        console.log("Vous avez choisie la lettre : " + userInput)
        for(let i: number = 0; i < ArrayUser.length; i++) {
            if(userInput == myWordSplit[i]) {
                console.log("trouvé !")
                ArrayUser[i] = userInput
            }
        }         
        }


        console.log(ArrayUser)
    }
    console.log(" Vous avez gagné !")
    console.log(" Voulez-vous recommencer ? Y | N")
    userSelect = prompt()
}
