class Deck5 {
    private val ranks = listOf("K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2", "A")
    private val suits = listOf("♣", "♦", "♥", "♠")
    private var cards = mutableListOf<String>()
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

class Hand5 {
    var cards = mutableListOf<String>()
    fun playACard(table: MutableList<String>, card: Int) {
        table.add(cards.removeAt(card))
    }

class Pile5 {
    var cards = mutableListOf<String>()
    fun score(): Int {
        var score = 0
        for (card in cards) {
            if (card[0] == 'A' || card[0] == '1' || card[0] == 'J' || card[0] == 'Q' || card[0] == 'K') score++
        }
        return(score)
    }
    fun addToPile(table: MutableList<String>) {
        cards.addAll(table)
        table.clear()
    }
}

fun main5() {
    println("Indigo Card Game")
    var answer: String
    do {
        println("Play first?")
        answer = readln()
    } while (answer != "yes" && answer != "no")

    val deck = Deck5()
    val player = mutableListOf<String>()
    val computer = mutableListOf<String>()
    val playerPile = Pile5()
    val computerPile = Pile5()
    val table = mutableListOf<String>()
    var turn = answer == "yes"
    val playedFirst = turn
    var scoredLast = turn
    var playerScore: Int
    var computerScore: Int

    deck.shuffle()
    for (i in 1..4) table.add(deck.get())
    print("Initial cards on the table:")
    for (card in table) print(" $card")
    println()
    while (playerPile.cards.size + computerPile.cards.size + table.size < 52) {
        if (player.size == 0 && computer.size == 0) deck.deal(player, computer)
        println(
            if (table.size == 0) "No cards on the table"
            else "${table.size} cards on the table, and the top card is ${table.last()}"
        )
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
        if (table.size > 1 && (table[table.size - 1].first() == table[table.size - 2].first() || table[table.size - 1].last() == table[table.size - 2].last())) {
            if (turn) {
                playerPile.addToPile(table)
                println("Player wins cards")
            }
            else {
                computerPile.addToPile(table)
                println("Computer wins cards")
            }
            playerScore = playerPile.score()
            computerScore = computerPile.score()
            println("Score: Player $playerScore - Computer $computerScore")
            println("Cards: Player ${playerPile.cards.size} - Computer ${computerPile.cards.size}")
            scoredLast = turn
        }
        turn = !turn
    }
    println(
        if (table.size == 0) "No cards on the table"
        else "${table.size} cards on the table, and the top card is ${table.last()}"
    )
    if (scoredLast) playerPile.addToPile(table)
    else computerPile.addToPile(table)

    playerScore = playerPile.score()
    computerScore = computerPile.score()
    if (playerPile.cards.size == computerPile.cards.size) {
        if (playedFirst) playerScore += 3
        else computerScore += 3
    } else if (playerPile.cards.size > computerPile.cards.size) playerScore += 3
    else computerScore += 3

    println("Score: Player $playerScore - Computer $computerScore")
    println("Cards: Player ${playerPile.cards.size} - Computer ${computerPile.cards.size}")
    println("Game Over")
}