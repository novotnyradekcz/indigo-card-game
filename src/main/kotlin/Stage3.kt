class Deck3 {
    private val ranks = listOf("K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2", "A")
    private val suits = listOf("♣", "♦", "♥", "♠")
    var cards = mutableListOf<String>()
    init {
        for (suit in suits) {
            for (rank in ranks) cards.add(rank + suit)
        }
    }
    fun shuffle() {
        cards.shuffle()
    }
    fun get(): String {
        val card = cards[0]
        cards.removeAt(0)
        return(card)
    }
    fun deal(player1: MutableList<String>, player2: MutableList<String>) {
        for (i in 1..6) {
            player1.add(get())
            player2.add(get())
        }
    }
}

fun main3() {
    println("Indigo Card Game")
    var answer: String
    do {
        println("Play first?")
        answer = readln()
    } while (answer != "yes" && answer != "no")

    val deck = Deck3()
    val player = mutableListOf<String>()
    val computer = mutableListOf<String>()
    val table = mutableListOf<String>()
    var turn = answer == "yes"
    deck.shuffle()
    for (i in 1..4) table.add(deck.get())
    print("Initial cards on the table:")
    for (card in table) print(" $card")
    println()
    while (table.size <52) {
        if (player.size == 0 && computer.size == 0) deck.deal(player, computer)
        println("${table.size} cards on the table, and the top card is ${table.last()}")
        if (turn) {
            print("Cards in hand:")
            for (i in 0 until player.size) print(" ${i + 1})${player[i]}")
            println()
            var numCard: Int
            do {
                println("Choose a card to play (1-${player.size}):")
                val inputCard = readln()
                if (inputCard == "exit") {
                    println("Game Over")
                    return
                }
                numCard = try {
                    inputCard.toInt()
                } catch (e: java.lang.NumberFormatException) {
                    0
                }
            } while (numCard !in 1..player.size)
            table.add(player[numCard - 1])
            player.removeAt(numCard - 1)
        } else {
            table.add(computer[0])
            computer.removeAt(0)
            println("Computer plays ${table.last()}")
        }
        turn = !turn
    }
    println("${table.size} cards on the table, and the top card is ${table.last()}")
    println("Game Over")
}