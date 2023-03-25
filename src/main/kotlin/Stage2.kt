class Deck2 {
    private val ranks = listOf("K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2", "A")
    private val suits = listOf("♣", "♦", "♥", "♠")
    var cards = mutableListOf<String>()
    init {
        for (suit in suits) {
            for (rank in ranks) cards.add(rank + suit)
        }
    }
    fun reset() {
        cards = mutableListOf()
        for (suit in suits) {
            for (rank in ranks) cards.add(rank + suit)
        }
    }
    fun shuffle() {
        cards.shuffle()
    }
    fun get(number: Int) {
        for (i in 0 until number) {
            print(cards[0] + " ")
            cards.removeAt(0)
        }
        println()
    }
}

fun main2() {
    val deck = Deck2()


    var action = ""
    while (action != "exit") {
        println("Choose an action (reset, shuffle, get, exit):")
        action = readln()
        when (action) {
            "reset" -> {
                deck.reset()
                println("Card deck is reset.")
            }
            "shuffle" -> {
                deck.shuffle()
                println("Card deck is shuffled.")
            }
            "get" -> {
                println("Number of cards:")
                val number = readln()
                try {
                    number.toInt()
                } catch (e: java.lang.NumberFormatException) {
                    println("Invalid number of cards.")
                    continue
                }
                if (number.toInt() !in 1..52) println("Invalid number of cards.")
                else if (number.toInt() in 1..deck.cards.size) deck.get(number.toInt())
                else println("The remaining cards are insufficient to meet the request.")
            }
            "exit" -> continue
            else -> println("Wrong action.")
        }
    }
    println("Bye")
}