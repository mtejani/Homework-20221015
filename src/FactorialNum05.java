import java.util.Scanner;

public class FactorialNum05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please a number to find its Factorial numbers :- "); // to displace a command to user to enter a number.
        int n = scanner.nextInt(); // to input a number for factorial .

        int fact=1; // to assign temp number for factorial dividable

        for (int i=1; i<=n; i++)
        {
         fact=fact*i;
        }
        System.out.println("Factorial  "+fact);

    }
}