import java.util.Scanner;

public class OddEvenDigit11
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please five digit number :- "); // display a msg to user to enter a msgPrime number.
        int n = scanner.nextInt(); // to input a number for to sum odd or even sum.

        int sum=0; //temp sum for number

        if(n%2==0) //to find even number
        {
            for (int i = 0; i<=n; i=i+2)
            {
            sum=sum+i;
            }
            System.out.println("Sum of even number "+sum); //to print even number
        }
        else //rest are odd number
        {
            for (int i = 1; i <=n; i=i+2)
            {
                sum=sum+i;
            }
            System.out.println("Sum of odd number "+sum); //to print odd number
        }

    }
}
