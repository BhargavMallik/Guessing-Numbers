# Guessing Number Game

This Java program is a simple number guessing game where the user has to guess a randomly generated number between 1 and 100 within 5 chances. The program provides feedback after each guess, indicating whether the guessed number is higher or lower than the target number. 

## How to Run the Program

1. Ensure you have Java installed on your system.
2. Copy the provided code into a file named `GuessingNumber.java`.
3. Open a terminal or command prompt.
4. Navigate to the directory containing the `GuessingNumber.java` file.
5. Compile the program using the following command:
   ```sh
   javac GuessingNumber.java
   ```
6. Run the compiled program with the command:
   ```sh
   java GuessingNumber
   ```

## How to Play

1. The program will generate a random number between 1 and 100.
2. You will have 5 chances to guess the number.
3. After each guess, the program will tell you whether the guessed number is higher or lower than the target number.
4. If you guess the correct number within 5 chances, you win!
5. If you do not guess the correct number within 5 chances, the game will reveal the target number and end.

### Explanation

- **Imports**:
  - `import java.util.Scanner;`: Imports the Scanner class for user input.
- **Class**:
  - `class GuessingNumber`: The main class containing the game logic.
- **Methods**:
  - `public static void guessingNumber()`: The method where the game logic resides.
  - `public static void main(String[] args)`: The main method that starts the game by calling `guessingNumber()`.
- **Game Logic**:
  - A random number between 1 and 100 is generated using `Math.random()`.
  - The user is given 5 chances to guess the number.
  - The program provides feedback whether the guessed number is higher or lower than the target number.
  - If the user guesses correctly within the given chances, a congratulatory message is displayed.
  - If the user fails to guess within 5 chances, the correct number is revealed.

Enjoy playing the Guessing Number Game!
