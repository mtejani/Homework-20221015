import java.util.Scanner;

public class PrimeNumber03
{

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please any number to verify if given number is prime or not prime number :- "); // Prime number verification.
        int n = scanner.nextInt(); // to input a number for Prime or not.

        boolean flag = false;
        for (int i = 2; i <= n / 2; ++i) {
            // condition for non prime number
            if (n % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag) //reverses the logical state.
            System.out.println(n + " is a prime number."); //when condition match print as Prime number
        else
            System.out.println(n + " is not a prime number."); ////when condition failed print as Non Prime number
    }

 }

