fun main() {

    val options = arrayOf("Rock", "Paper", "Scissors")

    val computerChoice = getComputerChoice(options)
    val userChoice = getUserChoice(options)
    val result = getResult(computerChoice, userChoice)

    println("\nComputer chose $computerChoice\nYou chose $userChoice\n$result")

}

fun getComputerChoice(options: Array<String>): String = options[((Math.random()) * (options.size) + (Math.random()) * (options.size)).toInt() % (options.size)]
// In the above function, added another random value with the first random value
// This is because, with only one random value, I found that the probability of "Scissors" is very high as it turned out most of the time

fun getUserChoice(options: Array<String>): String {
    var isValidChoice = false
    var userInput = ""
    while(!isValidChoice){

        print("It's your turn. Choose one: ")
        for((index, item) in options.withIndex())
            print("${index+1}.$item ")
        println()

        val tempUserInput = readLine()

        if( (tempUserInput != null) && (tempUserInput in options) ){
            isValidChoice = true
            userInput = tempUserInput
        }
        else
            println("Please enter a valid choice!\n")
    }
    return userInput
}

fun getResult(computerChoice: String, userChoice: String): String {

    if(computerChoice == userChoice)
        return "Tie :|"

    else if(
        (computerChoice == "Rock") && (userChoice == "Scissors") ||
        (computerChoice == "Paper") && (userChoice == "Rock") ||
        (computerChoice == "Scissors") && (userChoice == "Paper")
    )
        return "Computer won :/"

    return "You won :)"
}