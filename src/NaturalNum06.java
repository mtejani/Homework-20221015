import java.util.Scanner;

public class NaturalNum06
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please a number for Natural number require :- "); // Natural number verification.
        int n = scanner.nextInt(); // to input a number for to find factorial number.

        int sum=0;

        for (int i = 1; i <=n; i++)//1<n?
        {
            sum=sum+i;
        }
        System.out.println("Sum of " +n+" number is " +sum);

    }
}
