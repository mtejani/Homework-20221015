import java.util.Scanner;

public class FirstLastDigitSum14
{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please five digit number :- "); // to take digit command from user.
        int n = scanner.nextInt(); // to input a number for first and last digit calculation.

       int l = 0,sum; //temp int and counter

       l=n%10; //to find first and last number

        while(n>9) //
        {
            n=n/10;

        }
      sum=n+l;
        System.out.println("Sum of 1st & Last" +sum); //to display outcome of calculation.
    return;

    }
}
