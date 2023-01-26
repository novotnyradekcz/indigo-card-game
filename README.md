# Indigo Card Game
Indigo Card Game project created as part of the Kotlin Basics course on JetBrains Academy

## Stage 1/5: Card deck symbols

### Description

In this project, we will work on a simple card game called Indigo. We will use a standard virtual 52-card deck. This will be a one-player game, so we will employ an easy strategy for the computer in the final stage.

The main game concept is easy. Players take turns in tossing cards onto the table. If a player throws a card with the same suit or rank as the topmost card on the table, that player wins all the cards on the table.

The deck card ranks are `A`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `J`, `Q`, and `K`. Deck card suits include `♦`, `♥`, `♠`, `♣`. A card is represented by a rank and a suit. The whole deck includes `K♣`, `Q♣`, `J♣`, `10♣`, `9♣`, `8♣`, `7♣`, `6♣`, `5♣`, `4♣`, `3♣`, `2♣`, `A♣`, `K♦`, `Q♦`, `J♦`, `10♦`, `9♦`, `8♦`, `7♦`, `6♦`, `5♦`, `4♦`, `3♦`, `2♦`, `A♦`, `K♥`, `Q♥`, `J♥`, `10♥`, `9♥`, `8♥`, `7♥`, `6♥`, `5♥`, `4♥`, `3♥`, `2♥`, `A♥`, `K♠`, `Q♠`, `J♠`, `10♠`, `9♠`, `8♠`, `7♠`, `6♠`, `5♠`, `4♠`, `3♠`, `2♠`, `A♠`.

### Objectives
1. Print a line with all ranks, separated by space;
2. Print a line with all suits, separated by space;
3. Print a line with all deck cards, separated by space.

### Example
**Example 1:** *symbols and cards*
```
A 2 3 4 5 6 7 8 9 10 J Q K

♦ ♥ ♠ ♣

A♠ 2♠ 3♠ 4♠ 5♠ 6♠ 7♠ 8♠ 9♠ 10♠ J♠ Q♠ K♠ A♥ 2♥ 3♥ 4♥ 5♥ 6♥ 7♥ 8♥ 9♥ 10♥ J♥ Q♥ K♥ A♦ 2♦ 3♦ 4♦ 5♦ 6♦ 7♦ 8♦ 9♦ 10♦ J♦ Q♦ K♦ A♣ 2♣ 3♣ 4♣ 5♣ 6♣ 7♣ 8♣ 9♣ 10♣ J♣ Q♣ K♣
```
