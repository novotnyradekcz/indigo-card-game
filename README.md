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

### Examples

The greater-than symbol followed by a space (`> `) represents the user input. Note that it's not part of the input.

**Example 1:** *standard execution*
```
Choose an action (reset, shuffle, get, exit):
> reset
Card deck is reset.
Choose an action (reset, shuffle, get, exit):
> shuffle
Card deck is shuffled.
Choose an action (reset, shuffle, get, exit):
> get
Number of cards:
> 10
2♥ A♦ 8♠ 2♣ Q♠ 8♣ 5♥ 8♥ K♠ J♣
Choose an action (reset, shuffle, get, exit):
> get
Number of cards:
> 6
J♦ J♠ 3♣ Q♣ 10♠ 5♦
Choose an action (reset, shuffle, get, exit):
> reset
Card deck is reset.
Choose an action (reset, shuffle, get, exit):
> get
Number of cards:
> 52
K♣ Q♣ J♣ 10♣ 9♣ 8♣ 7♣ 6♣ 5♣ 4♣ 3♣ 2♣ A♣ K♦ Q♦ J♦ 10♦ 9♦ 8♦ 7♦ 6♦ 5♦ 4♦ 3♦ 2♦ A♦ K♥ Q♥ J♥ 10♥ 9♥ 8♥ 7♥ 6♥ 5♥ 4♥ 3♥ 2♥ A♥ K♠ Q♠ J♠ 10♠ 9♠ 8♠ 7♠ 6♠ 5♠ 4♠ 3♠ 2♠ A♠
Choose an action (reset, shuffle, get, exit):
> reset
Card deck is reset.
Choose an action (reset, shuffle, get, exit):
> shuffle
Card deck is shuffled.
Choose an action (reset, shuffle, get, exit):
> get
Number of cards:
> 52
5♥ K♣ 4♣ Q♣ 6♣ J♣ 7♦ J♥ 2♣ 7♠ 8♦ 6♥ 9♥ 7♣ 10♥ 7♥ 5♦ 10♦ 6♦ K♠ 5♠ K♥ 6♠ A♣ 3♥ J♠ 2♦ 3♦ 8♠ 4♦ 5♣ 3♠ 9♠ 8♥ J♦ Q♦ Q♥ 4♥ 10♠ K♦ Q♠ 9♦ 9♣ A♦ 4♠ 2♥ 10♣ 8♣ A♥ 2♠ 3♣ A♠
Choose an action (reset, shuffle, get, exit):
> exit
Bye
```

**Example 2:** *invalid number of cards*
```
Choose an action (reset, shuffle, get, exit):
> get
Number of cards:
> 0
Invalid number of cards.
Choose an action (reset, shuffle, get, exit):
> get
Number of cards:
> 53
Invalid number of cards.
Choose an action (reset, shuffle, get, exit):
> get
Number of cards:
> one
Invalid number of cards.
Choose an action (reset, shuffle, get, exit):
> exit
Bye
```

**Example 3:** *insufficient cards*
```
Choose an action (reset, shuffle, get, exit):
> reset
Card deck is reset.
Choose an action (reset, shuffle, get, exit):
> get
Number of cards:
> 10
K♣ Q♣ J♣ 10♣ 9♣ 8♣ 7♣ 6♣ 5♣ 4♣
Choose an action (reset, shuffle, get, exit):
> get
Number of cards:
> 43
The remaining cards are insufficient to meet the request.
Choose an action (reset, shuffle, get, exit):
> reset
Card deck is reset.
Choose an action (reset, shuffle, get, exit):
> get
Number of cards:
> 52
K♣ Q♣ J♣ 10♣ 9♣ 8♣ 7♣ 6♣ 5♣ 4♣ 3♣ 2♣ A♣ K♦ Q♦ J♦ 10♦ 9♦ 8♦ 7♦ 6♦ 5♦ 4♦ 3♦ 2♦ A♦ K♥ Q♥ J♥ 10♥ 9♥ 8♥ 7♥ 6♥ 5♥ 4♥ 3♥ 2♥ A♥ K♠ Q♠ J♠ 10♠ 9♠ 8♠ 7♠ 6♠ 5♠ 4♠ 3♠ 2♠ A♠
Choose an action (reset, shuffle, get, exit):
> get
Number of cards:
> 1
The remaining cards are insufficient to meet the request.
Choose an action (reset, shuffle, get, exit):
> exit
Bye
```

**Example 4:** *wrong actions*
```
Choose an action (reset, shuffle, get, exit):
> card
Wrong action.
Choose an action (reset, shuffle, get, exit):
> action
Wrong action.
Choose an action (reset, shuffle, get, exit):
> look card
Wrong action.
Choose an action (reset, shuffle, get, exit):
> deck
Wrong action.
Choose an action (reset, shuffle, get, exit):
> exit
Bye
```

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

### Examples

The greater-than symbol followed by a space (`> `) represents the user input. Note that it's not part of the input.

Example 2 has been shortened.

**Example 1:** *standard execution; player first*
```
Indigo Card Game
Play first?
> yes
Initial cards on the table: 5♥ 3♦ 10♠ A♣

4 cards on the table, and the top card is A♣
Cards in hand: 1)2♥ 2)7♠ 3)4♦ 4)5♣ 5)9♠ 6)A♠
Choose a card to play (1-6):
> 2

5 cards on the table, and the top card is 7♠
Computer plays A♦

6 cards on the table, and the top card is A♦
Cards in hand: 1)2♥ 2)4♦ 3)5♣ 4)9♠ 5)A♠
Choose a card to play (1-5):
> 4

7 cards on the table, and the top card is 9♠
Computer plays 4♣

8 cards on the table, and the top card is 4♣
Cards in hand: 1)2♥ 2)4♦ 3)5♣ 4)A♠
Choose a card to play (1-4):
> 4

9 cards on the table, and the top card is A♠
Computer plays 9♦

10 cards on the table, and the top card is 9♦
Cards in hand: 1)2♥ 2)4♦ 3)5♣
Choose a card to play (1-3):
> 1

11 cards on the table, and the top card is 2♥
Computer plays 10♣

12 cards on the table, and the top card is 10♣
Cards in hand: 1)4♦ 2)5♣
Choose a card to play (1-2):
> 2

13 cards on the table, and the top card is 5♣
Computer plays 7♥

14 cards on the table, and the top card is 7♥
Cards in hand: 1)4♦
Choose a card to play (1-1):
> 1

15 cards on the table, and the top card is 4♦
Computer plays 8♥

16 cards on the table, and the top card is 8♥
Cards in hand: 1)K♣ 2)3♣ 3)2♣ 4)K♥ 5)7♣ 6)6♣
Choose a card to play (1-6):
> 2

17 cards on the table, and the top card is 3♣
Computer plays 10♥

18 cards on the table, and the top card is 10♥
Cards in hand: 1)K♣ 2)2♣ 3)K♥ 4)7♣ 5)6♣
Choose a card to play (1-5):
> 3

19 cards on the table, and the top card is K♥
Computer plays 4♥

20 cards on the table, and the top card is 4♥
Cards in hand: 1)K♣ 2)2♣ 3)7♣ 4)6♣
Choose a card to play (1-4):
> 1

21 cards on the table, and the top card is K♣
Computer plays 4♠

22 cards on the table, and the top card is 4♠
Cards in hand: 1)2♣ 2)7♣ 3)6♣
Choose a card to play (1-3):
> 1

23 cards on the table, and the top card is 2♣
Computer plays Q♦

24 cards on the table, and the top card is Q♦
Cards in hand: 1)7♣ 2)6♣
Choose a card to play (1-2):
> 1

25 cards on the table, and the top card is 7♣
Computer plays 6♥

26 cards on the table, and the top card is 6♥
Cards in hand: 1)6♣
Choose a card to play (1-1):
> 1

27 cards on the table, and the top card is 6♣
Computer plays A♥

28 cards on the table, and the top card is A♥
Cards in hand: 1)3♠ 2)10♦ 3)K♦ 4)5♦ 5)K♠ 6)Q♥
Choose a card to play (1-6):
> 1

29 cards on the table, and the top card is 3♠
Computer plays 8♦

30 cards on the table, and the top card is 8♦
Cards in hand: 1)10♦ 2)K♦ 3)5♦ 4)K♠ 5)Q♥
Choose a card to play (1-5):
> 1

31 cards on the table, and the top card is 10♦
Computer plays J♠

32 cards on the table, and the top card is J♠
Cards in hand: 1)K♦ 2)5♦ 3)K♠ 4)Q♥
Choose a card to play (1-4):
> 1

33 cards on the table, and the top card is K♦
Computer plays 8♣

34 cards on the table, and the top card is 8♣
Cards in hand: 1)5♦ 2)K♠ 3)Q♥
Choose a card to play (1-3):
> 1

35 cards on the table, and the top card is 5♦
Computer plays 5♠

36 cards on the table, and the top card is 5♠
Cards in hand: 1)K♠ 2)Q♥
Choose a card to play (1-2):
> 2

37 cards on the table, and the top card is Q♥
Computer plays 2♠

38 cards on the table, and the top card is 2♠
Cards in hand: 1)K♠
Choose a card to play (1-1):
> 1

39 cards on the table, and the top card is K♠
Computer plays Q♣

40 cards on the table, and the top card is Q♣
Cards in hand: 1)6♦ 2)J♣ 3)7♦ 4)Q♠ 5)9♥ 6)3♥
Choose a card to play (1-6):
> 6

41 cards on the table, and the top card is 3♥
Computer plays 6♠

42 cards on the table, and the top card is 6♠
Cards in hand: 1)6♦ 2)J♣ 3)7♦ 4)Q♠ 5)9♥
Choose a card to play (1-5):
> 5

43 cards on the table, and the top card is 9♥
Computer plays 9♣

44 cards on the table, and the top card is 9♣
Cards in hand: 1)6♦ 2)J♣ 3)7♦ 4)Q♠
Choose a card to play (1-4):
> 4

45 cards on the table, and the top card is Q♠
Computer plays J♦

46 cards on the table, and the top card is J♦
Cards in hand: 1)6♦ 2)J♣ 3)7♦
Choose a card to play (1-3):
> 3

47 cards on the table, and the top card is 7♦
Computer plays 8♠

48 cards on the table, and the top card is 8♠
Cards in hand: 1)6♦ 2)J♣
Choose a card to play (1-2):
> 2

49 cards on the table, and the top card is J♣
Computer plays J♥

50 cards on the table, and the top card is J♥
Cards in hand: 1)6♦
Choose a card to play (1-1):
> 1

51 cards on the table, and the top card is 6♦
Computer plays 2♦

52 cards on the table, and the top card is 2♦
Game Over
```

**Example 2:** *standard execution; computer first*
```
Indigo Card Game
Play first?
> no
Initial cards on the table: J♥ A♠ 8♥ 10♣

4 cards on the table, and the top card is 10♣
Computer plays 4♥

5 cards on the table, and the top card is 4♥
Cards in hand: 1)9♠ 2)4♣ 3)7♥ 4)4♦ 5)5♥ 6)K♥
Choose a card to play (1-6):
> 6

6 cards on the table, and the top card is K♥
Computer plays J♦


....................................
....................................
....................................


47 cards on the table, and the top card is Q♣
Cards in hand: 1)5♠ 2)5♦ 3)6♦
Choose a card to play (1-3):
> 1

48 cards on the table, and the top card is 5♠
Computer plays 2♥

49 cards on the table, and the top card is 2♥
Cards in hand: 1)5♦ 2)6♦
Choose a card to play (1-2):
> 2

50 cards on the table, and the top card is 6♦
Computer plays 8♣

51 cards on the table, and the top card is 8♣
Cards in hand: 1)5♦
Choose a card to play (1-1):
> 1

52 cards on the table, and the top card is 5♦
Game Over
```

**Example 3:** *play first? wrong input; exit*
```
Indigo Card Game
Play first?
> OK
Play first?
> sure
Play first?
> Noway
Play first?
> 0
Play first?
> yes
Initial cards on the table: J♥ 3♠ 8♠ Q♥

4 cards on the table, and the top card is Q♥
Cards in hand: 1)6♥ 2)9♥ 3)8♣ 4)6♦ 5)Q♦ 6)3♦
Choose a card to play (1-6):
> exit
Game Over
```

**Example 4:** *wrong card to play; exit*
```
Indigo Card Game
Play first?
> yes
Initial cards on the table: 4♦ 10♠ 9♣ 7♦

4 cards on the table, and the top card is 7♦
Cards in hand: 1)Q♦ 2)6♥ 3)4♥ 4)4♠ 5)Q♠ 6)3♦
Choose a card to play (1-6):
> 0
Choose a card to play (1-6):
> 7
Choose a card to play (1-6):
> one
Choose a card to play (1-6):
> 5

5 cards on the table, and the top card is Q♠
Computer plays K♠

6 cards on the table, and the top card is K♠
Cards in hand: 1)Q♦ 2)6♥ 3)4♥ 4)4♠ 5)3♦
Choose a card to play (1-5):
> exit
Game Over
```

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

### Examples

The greater-than symbol followed by a space (`> `) represents the user input. Note that it's not part of the input.

The examples have been shortened.

**Example 1:** *standard execution; player first*
```
Indigo Card Game
Play first?
> yes
Initial cards on the table: 5♦ J♦ K♣ 5♠

4 cards on the table, and the top card is 5♠
Cards in hand: 1)J♠ 2)8♦ 3)2♦ 4)6♥ 5)2♣ 6)A♦
Choose a card to play (1-6):
> 1
Player wins cards
Score: Player 3 - Computer 0
Cards: Player 5 - Computer 0

No cards on the table
Computer plays Q♠

1 cards on the table, and the top card is Q♠
Cards in hand: 1)8♦ 2)2♦ 3)6♥ 4)2♣ 5)A♦
Choose a card to play (1-5):
> 2

2 cards on the table, and the top card is 2♦
Computer plays 7♠

3 cards on the table, and the top card is 7♠
Cards in hand: 1)8♦ 2)6♥ 3)2♣ 4)A♦
Choose a card to play (1-4):
> 3

4 cards on the table, and the top card is 2♣
Computer plays 5♣
Computer wins cards
Score: Player 3 - Computer 1
Cards: Player 5 - Computer 5

No cards on the table
Cards in hand: 1)8♦ 2)6♥ 3)A♦
Choose a card to play (1-3):
> 1

1 cards on the table, and the top card is 8♦
Computer plays 4♦
Computer wins cards
Score: Player 3 - Computer 1
Cards: Player 5 - Computer 7


...................................
...................................
...................................


1 cards on the table, and the top card is K♥
Cards in hand: 1)3♥ 2)2♥
Choose a card to play (1-2):
> 2
Player wins cards
Score: Player 12 - Computer 8
Cards: Player 26 - Computer 23

No cards on the table
Computer plays 9♠

1 cards on the table, and the top card is 9♠
Cards in hand: 1)3♥
Choose a card to play (1-1):
> 1

2 cards on the table, and the top card is 3♥
Computer plays 6♣

3 cards on the table, and the top card is 6♣
Score: Player 15 - Computer 8
Cards: Player 29 - Computer 23
Game Over
```

**Example 2:** *standard execution; computer first*
```
Indigo Card Game
Play first?
> no
Initial cards on the table: A♠ 10♠ 2♣ J♦

4 cards on the table, and the top card is J♦
Computer plays 2♦
Computer wins cards
Score: Player 0 - Computer 3
Cards: Player 0 - Computer 5

No cards on the table
Cards in hand: 1)9♥ 2)J♠ 3)9♦ 4)7♦ 5)10♣ 6)5♠
Choose a card to play (1-6):
> 1

1 cards on the table, and the top card is 9♥
Computer plays 3♣

2 cards on the table, and the top card is 3♣
Cards in hand: 1)J♠ 2)9♦ 3)7♦ 4)10♣ 5)5♠
Choose a card to play (1-5):
> 5

3 cards on the table, and the top card is 5♠
Computer plays Q♦

4 cards on the table, and the top card is Q♦
Cards in hand: 1)J♠ 2)9♦ 3)7♦ 4)10♣
Choose a card to play (1-4):
> 2
Player wins cards
Score: Player 1 - Computer 3
Cards: Player 5 - Computer 5

No cards on the table
Computer plays 4♣

1 cards on the table, and the top card is 4♣
Cards in hand: 1)J♠ 2)7♦ 3)10♣
Choose a card to play (1-3):
> 1

2 cards on the table, and the top card is J♠
Computer plays 7♣

3 cards on the table, and the top card is 7♣
Cards in hand: 1)7♦ 2)10♣
Choose a card to play (1-2):
> 1
Player wins cards
Score: Player 2 - Computer 3
Cards: Player 9 - Computer 5

No cards on the table
Computer plays 5♦


...................................
...................................
...................................


3 cards on the table, and the top card is 3♥
Computer plays 9♣

4 cards on the table, and the top card is 9♣
Cards in hand: 1)7♠ 2)K♦
Choose a card to play (1-2):
> 2

5 cards on the table, and the top card is K♦
Computer plays J♥

6 cards on the table, and the top card is J♥
Cards in hand: 1)7♠
Choose a card to play (1-1):
> 1

7 cards on the table, and the top card is 7♠
Score: Player 17 - Computer 6
Cards: Player 35 - Computer 17
Game Over
```
