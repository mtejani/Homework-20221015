import java.util.Scanner;

public class Reverse04
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please any number to see in reverse order:- "); // input the number.
        int n = scanner.nextInt(); // to input a number.

        int r; //temp number int

        while (n > 0)
        {
            r = n % 10; // to find carry forward number using modulus
            System.out.print(+r);
            n=n/10; //asign remain number to n again to loop
        }

    }

}
