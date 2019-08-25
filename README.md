# Tic-Tac-Toe_with_AI
Stage #1: Print a state of the game field

Description

Tic-tac-toe is a game played by two players on a 3x3 field.

One of the players plays as 'X', and the other player is 'O'. 'X' plays first, then the 'O' side plays, and so on.

The players write 'X' and 'O' on a 3x3 field.

The first player that writes 3 'X' or 3 'O' in a straight line (including diagonals) wins.

Your first task in this project is to print any state of the field in the console output.

Output example

The example below shows how your output might look.

X O X</br>
O X O</br>
X X O 

Stage #2: Create a simple game field

Description

In this stage, you should write a program that reads 11 symbols (notice that input includes " symbols at the start and in the end of a line) from the input and writes an appropriate 3x3 field. Elements of the field can contain only 'X', 'O' and ' ' symbols (and input contain only these symbols except " at the start and in the end).

Note, that field has a specific format and should start and end with '---------', all lines in between should start and end with '|' symbol and cells and '|' symbols should be separated with a single space.  
 

Output example

Examples below show how your output should look.

Enter cells: "O OXXO XX"
---------
| O - O |</br>
| X X O |</br>
| - X X |
---------
 Enter cells: "OXO  X OX"
---------
| O X O |</br>
| - - X |</br>
| - O X |
---------
 Enter cells: " XO  X   "
---------
| -  X O |</br>
| -  -  X |</br>
|  -  - -  |
---------
