fun main1() {
    val ranks = listOf<String>("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K")
    val suits = listOf<String>("♦", "♥", "♠", "♣")
    for (rank in ranks) print("$rank ")
    println()
    for (suit in suits) print("$suit ")
    println()
    for (suit in suits) {
        for (rank in ranks) {
            print("$rank$suit ")
        }
    }
}