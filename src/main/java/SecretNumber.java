import java.util.Random;
import java.util.Scanner;

public class SecretNumber {
    //    This is our Psuedo Code, used to guideanyone reading out code through our steps and procceses (cmd/)
//    We start by entering 'main' and pressing tab so that InteliJ can complete the rest of our code, this is done for each new class we create
    public static void main(String[] args) {

//        We want to create a secret number game, but first let's introduce our user to our game, we can do this by simply entering 'sout'
//        Then we press tab, IntelliJ will autofill for us, and we print our message within the brackets (in quotations as it is text)

        System.out.println("Hi, welcome to the secret number game");


//        Run the code to check if it works.
//        Select 'view' then 'run byte code' This shows what is fed to the JVM( Java Virtual Machine) to run our program.

//        Now let's start our game. First we have to select a random number, as it is a number not text, or a decimal, or a very big number, we use integer before it
//        But, to make the game better let's create a genuine random number, that changes each time, so even us as the game creator can play

        Random pear = new Random();  //Random is a class to generate something...random. It is a new clas so we use new

//      As it is a number game, we use an int. Assign our class a title, here it is randomNumber
//        Entitle the integer randomNumber, as sensible name for our random number
//        This will be equal to our random class (pear)then .nextInt   nextInt returns a value between 0 and whatever number is between our brackets
//        Outside the brackets you can put +x  x is any number you want t start from added to 0

        int secretNumber = pear.nextInt(1000) + 1;

//        Prompt a user to guess what the secret number is using the same coding as the intro (sout)
//        To simplify the game at this low level, enter the lowest and greatest number it could be

        while (true) {
            System.out.println("What is the secret number? (2-1000)");


            //        Collect user input by creating a Scanner Class

            Scanner reader1 = new Scanner(System.in); // This creates our Scanner object. we entitle it reader1

            int userGuess = reader1.nextInt(); // This stores our user answer in a variable. .nextInt allows us to convert our user answer to a integer


            //        If a user's guess correct, print message 'you win!'

            if (userGuess == secretNumber) {  //in our if statement, we use == not .equals as dealing with integers
                System.out.println("you win!");
                break;
            }


            //        If a user's guess is greater than the secret number, print message 'too high'

            else if (secretNumber < userGuess) {
                System.out.println("You guessed too high!");
            }

            //        If a user's guess is too low, print message 'too low'
            //        Here, as we know we have a user answer that isn't correct or too low,it must be too high
            //        Hence, it is an unnecessary peice of code to use the same code as above with a > instead of <

            else System.out.println("you guessed too low!");

//        To check if our code entirely works, we'll need to know our random secret number is to see if our
//        else if statement works. We enter the code below but without the // on line 35
//        It must be placed before our scanner class creation but after we create our secret number variable to see if it works

            ////// System.out.println("Random number is" + secretNumber); /////////

//   We can now create a loop, so that if our user answers wrong, they can guess again until correct
//  We use while(true) to create the loop, now our code will allow users to answer forever.
//   However, in this game we want the game to stop when, and only when the user answers the correctly (in our only if condition)
//  Final note: So we insert while(true) before our user's sout guess
//              We enter the break after the line of code where we want the loop to stop


        }
    }
}
