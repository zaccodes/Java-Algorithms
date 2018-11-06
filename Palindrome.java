import java.util.Scanner;

public class Palindrome {

    /* The algorithm challenge explanation
    Write a program which takes input as string and check if it is palindrome or not.
    If the string and the reverse of string are same then we say string is palindrome.
     */

    public static void main(String[] args) {

        // Instantiating Scanner
        Scanner input = new Scanner(System.in);

        //Prompting user for a string
        System.out.println("Insert a word to check if it is a palindrome:");
        String userInput = input.next();

        //Instantiating an empty StringBuffer to store the reverse of the string
        StringBuilder reversedUserInput = new StringBuilder("");

        for(int i = userInput.length(); i != 0; i--)
            reversedUserInput.append((userInput.charAt(i-1)));

        if(userInput.contains(reversedUserInput))
            System.out.println("Issa Palindrome");
        else
            System.out.println("Is not a Palindrome");

        //Checking the reverse string
        System.out.println(reversedUserInput);
    }
}
