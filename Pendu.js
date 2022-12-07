const dictionary = ["Chocolat","Science","Informatique","Musique","Geologie","Gastronomie"]
let find = false
let userSelect
// let regexInput = new RegExp("/^[a-zA-Z]{1}$")

function getOneWord(table) {
    
    const myWord = dictionary[Math.floor(Math.random() * table.length)]
    const myArray = myWord.split("")
    for(let i = 0; i < myArray.length; i++) {
        myArray[i] = myArray[i].toUpperCase()
    }
    return myArray
}

function buildUserArray(wordArray) {
    let ArrayUser = []
    for(let i = 0; i < wordArray.length; i++) {
        ArrayUser.push("X")
    }
    return ArrayUser
}

function letsgame() {
    const myWordSplit = getOneWord(dictionary)
    console.log(myWordSplit)
    let ArrayUser = buildUserArray(myWordSplit)
    while(find == false) {
        if(myWordSplit == ArrayUser) {
            find = true
            console.log("the winner is !")
        }
        console.log("choose a letter")
        let userInput = prompt().toUpperCase()
        while(userInput.length > 1) {
            console.log("Nous vous demandons une seule lettre")
            userInput = prompt().toUpperCase()
        }
        console.log("Vous avez choisie la lettre : " + userInput)
        for(let i = 0; i < ArrayUser.length; i++) {
            if(userInput == myWordSplit[i]) {
                console.log("trouvé !")
                ArrayUser[i] = userInput
            }
        }

        console.log(ArrayUser)
    }
    console.log(" Vous avez gagné !")
    console.log(" Voulez-vous recommencer ? Y | N")
    userSelect = prompt()
}

letsgame()

switch (userSelect) {
    case 'Y' :
        letsgame()
    case "N" :
        break
    default :
    console.log('Wrong entry please try again')
        userSelect = prompt()
}






