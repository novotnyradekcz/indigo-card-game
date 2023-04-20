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

## Stage 2/5: Virtual card deck

### Description

In this stage, we will create a virtual card deck.

Provide the following operations to the card deck:

- Get the top cards from the deck and print them. Remove these cards from the deck;
- Shuffle the deck;
- Reset the deck (deal a new deck of 52 cards).

In this stage, we will also create a simple menu to test our virtual card deck.

### Objectives

Print the message: `Choose an action (reset, shuffle, get, exit):`. Users can choose one of the available options `reset`, `shuffle`, `get`, `exit`, and press enter. In case users enter anything else, print the message `Wrong action.` and ask users once again (Example 4).

If `reset`:

- Reset the deck to the original 52 cards;
- Print the message `Card deck is reset.`;
- Prompt for new action.

If `shuffle`:

- Change the order of the remaining cards in the deck;
- Print the message `Card deck is shuffled.`;
- Prompt for new action.

If `get`:

- Ask for the number of cards to be taken from the top of the deck with the prompt `Number of cards:`
- Users should input a number between `1` and `52`. Otherwise, for any number outside this range or for any non-number input, print `Invalid number of cards.` (Example 2);
- These cards are to be removed from the top of the deck and printed divided by one space (`6♦ 3♦ 8♦ 4♠ 9♦`). If the number of cards is larger than the number of the remaining cards in the deck, print `The remaining cards are insufficient to meet the request.` (Example 3);
- Prompt for new action.

If `exit`:

- Print `Bye`;
- Terminate the program.

## Stage 3/5: The game is started

### Description

We have a virtual card deck, and now, it is time to build the game's basic core and loop.

In the beginning, there're four cards on the table. The players get six cards and take turns in throwing one card at a time. One of the players is the computer. When they both have no cards in hand, deal another six cards to the players. This continues until there are no more cards in the deck. If you do the calculations, they will give you four deals (4 cards + 4 deals * 2 * 6 cards = 52 cards).

In the current stage, just pile up the cards on the table. We will implement a win condition in the next stage.

For each turn, print the information of the number of cards on the table and the top card. When it is the computer's turn, always put the first card in hand. The computer AI will get better in the final stage.

Users should have the option to exit the program at any time.

### Objectives

Print the project title: `Indigo Card Game`.

Ask whether users want to play first by prompting the `Play first?` statement. The only available input options should be `yes` or `no` (case insensitive). For any other input, print the question again (Example 3). If `yes`, then the player plays first (Example 1), and if `no`, then the computer plays first (Example 2).

Print the first 4 cards from the deck with the message: `Initial cards on the table: J♣ Q♣ 9♦ 5♦` (the cards here are random). Divide the cards with a single space. The last card on the right is the top card on the table.

After that, the player and computer take turns in putting cards on the table. If it is the player's turn, print the message `4 cards on the table, and the top card is 5♦`, where the first number is the number of cards on the table, and the card is the top card. Then print the cards in the player's hand with a prompt to choose one of them, as follows:

```
Cards in hand: 1)9♥ 2)4♠ 3)A♣ 4)9♣ 5)4♥ 6)3♥
Choose a card to play (1-6):
```

Divide the cards with a single space. The player should enter a number within the range of `1` to `<Number of cards in hand>`. If the input contains something else, prompt `Choose a card to play (1-6):` once again (Example 4).

If it is the computer's turn, print the message `5 cards on the table, and the top card is X` (a random card), where the first number is the number of cards on the table, and the card is the top card. Then, the computer should play the first card in hand. Print the message `Computer plays X` (a random card).

Once there're no more cards to play, print the message `52 cards on the table, and the top card is X` (a random card), followed by the message `Game Over`. Terminate the program.

If the player inputs `exit`, when prompted for a card, print the message `Game Over` and terminate the program (Examples 3 and 4).

## Stage 4/5: The game logic

### Description

We will implement the game rules in this stage. The game loop is ready, but the program can't do anything; the cards are just piling up on the table.

The game rules are easy:

1. Four cards are placed face-up on the table;
2. Six cards are dealt to each player;
3. The players take turns in playing cards. If the card has the same suit or rank as the topmost card, then the player wins all the cards on the table;
4. When both players have no cards in hand, go to step 2 unless there are no more remaining cards in the card deck.
5. **The remaining cards on the table go to the player who won the cards last.** In the rare case where none of the players win any cards, then all cards go to the player who played first.

When a card with the same suit or rank as the top card on the table is played, the one who tossed it wins all of the cards on the table. The program in this situation should save the cards for the winner before clearing the table of all cards. The program should be **keeping track** of all cards won by the two players.

The program should also **count the points** of each player, so develop a point system. The cards with the ranks `A`, `10`, `J`, `Q`, `K` get 1 point each, while the player who has the most cards gets three points. If the players have the same number of cards, then the player who played first gets these points. The total points in this game are 23. The player with the most points wins the game.

### Objectives

If the player throws a card that has the same suit or rank as the top card on the table, print the score and the cards won by each player with the message:
```
Player wins cards
Score: Player 2 - Computer 0
Cards: Player 5 - Computer 0
```

The second line shows the total points. The third line shows the number of cards for each player (here, the numbers are random).

If the computer throws a card that has the same suit or rank as the top card on the table, print the score and the cards won by each player with the message:
```
Computer wins cards
Score: Player 2 - Computer 1
Cards: Player 5 - Computer 5
```

If there are no cards on the table, print the message `No cards on the table` instead of `X cards on the table, and the top card is Y`.

When the game ends, **add the points of the remaining cards** and print the score and the cards won before the `Game Over` message:
```
Score: Player 6 - Computer 17
Cards: Player 12 - Computer 40
Game Over
```

Since this is the final score, the sum of cards should be 52, and the sum of points should be 23.

## Stage 5/5: Player VS Computer

### Description

It is time to make the computer smarter. Until now, the computer played a random card, but now it will follow a certain strategy.

For testing purposes, print the computer cards in hand before the computer chooses a card.

From now on, we will introduce the term **candidate cards**. They are the cards in hand that can win the cards on the table.

The strategy is as follows:

1) If there is only one card in hand, put it on the table (Example 2);

2) If there is only one candidate card, put it on the table (Example 3);

3) If there are no cards on the table:

   - If there are cards in hand with the same suit, throw one of them at random (Example 4). For example, if the cards in hand are `7♥ 9♥ 8♣ A♠ 3♦ 7♦ Q♥` (multiple `♥`, and `♦` suits), the computer will play one card at random.

   - If there are no cards in hand with the same suit, but there are cards with the same rank (this situation occurs only when there are 4 or fewer cards in hand), then throw one of them at random (Example 5). For example, if the cards in hand are `7♦ 7♥ 4♠ K♣`, throw one of `7♦ 7♥` at random.

   - If there are no cards in hand with the same suit or rank, throw any card at random. For example, if the cards in hand are `9♥ 8♣ A♠ 3♦`, throw any of them at random.

4) If there are cards on the table but no candidate cards, use the same tactics as in step 3. That is:

   - If there are cards in hand with the same suit, throw one of them at random (Example 6). For example, if the top card on the table is `A♦`, and the cards in hand are `6♣ Q♥ 8♣ J♠ 7♣` (multiple `♣` suit), the computer will place any of `6♣ 8♣ 7♣` at random.

   - If there are no cards in hand with the same suit, but there are cards with the same rank (this may occur when there are 3 or fewer cards in hand), throw one of them at random (Example 7). For example, if the top card on the table is `A♦` and the cards in hand are `J♠ Q♥ J♣`, put one of `J♠ J♣` at random.

   - If there are no cards in hand with the same suit or rank, then put any card at random. For example, if the top card on the table is `A♦`, and the cards in hand are `J♠ Q♥ K♣`, throw any of them at random.

5) If there are two or more candidate cards:

   - If there are 2 or more candidate cards with the same suit as the top card on the table, throw one of them at random (Example 8). For example, if the top card on the table is `5♥`, and the cards in hand are `6♥ 8♣ 5♠ 7♦ 7♥`, then the candidate cards are `6♥ 7♥ 5♠`. There are 2 candidate cards with the same suit as the top card on the table, `6♥ 7♥`. Place any at random.

   - If the above isn't applicable, but there are 2 or more candidate cards with the same rank as the top card on the table, throw one of them at random (example 9). For example, if the top card on the table is `J♥`, and the cards in hand are `3♥ J♣ J♠ 6♦`, then the candidate cards are `3♥ J♣ J♠`. In this case, there are no 2 or more candidate cards with the same suit, but there are 2 candidate cards with the same rank as the top card on the table that are `J♣ J♠`. Put any at random.

   - If nothing of the above is applicable, then throw any of the candidate cards at random.
The strategy above can be improved. Moreover, the computer can play even better if it keeps track of the cards that have been played. However, our goal isn't a complex algorithm for the computer, but to learn how to apply the strategy.

### Objectives

Implement the strategy above.

For testing purposes, print the computer cards in hand. Every time the computer plays, print an extra line. It should contain the computer cards in hand separated by one space, just before the computer plays its card (Example 1):
```
4 cards on the table, and the top card is A♣
6♣ 8♣ Q♦ 10♦ Q♥ 4♠
Computer plays 6♣
```
