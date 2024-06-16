import java.util.Scanner;

class GuessingNumber
{
      public static void guessingNumber()
      {
             Scanner sc = new Scanner(System.in);

             int number = 1 + (int)(100 * Math.random());

             int chances = 5;

             int i,userInput;

             System.out.println("A Number is chosen between 1 to 100. Now, Guess the number within " +chances+ " Chances.");

             for(i = 0; i < chances; i++)
             {
                 System.out.println("Guess the number");

                 userInput = sc.nextInt();

                 if (number == userInput)
                 {
                      System.out.println("Congratualtions! You got it Buddy.");
                      break;
                 }
                 else if (number > userInput)
                 {
                      System.out.println("The number is greater than "+userInput);
                 }
                 else if (number < userInput)
                 {
                      System.out.println("The number is Less than "+userInput);
                 }
             }
             if (i == chances)
             {
                System.out.println("Your Chances are Completed Buddy.");
 
                System.out.println("The Number is "+number);
             }
             sc.close();              
      }
      public static void main(String[] args)
      {
             guessingNumber();
      }
}