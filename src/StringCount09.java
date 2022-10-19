import java.util.Scanner;

public class StringCount09
{
    public static void main(String[] args)
    {

        // Method that return count of the given
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type a sentence for charater you would lile to find from:- "); // mesg to user to take command by user.
        String line = scanner.next(); // user to type sentence.

        System.out.print("Which letter would like to count the number of times it appears:- "); // msg to user to enter the letter for searching.
        char letter = scanner.next().charAt(0); // user to enter alphabet letter.

        int counter=0; //temp counter a letter

        for (int i = 0; i<line.length(); i++)
        {if (line.charAt(i)==letter) //to search letter
            counter++; //if success add to counter to sum up
        }
        System.out.println("The letter "+letter+" appeared "+counter+" times"); //display a sum of the letter counter

    }

}
