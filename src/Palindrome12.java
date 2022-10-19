import java.util.Scanner;

public class Palindrome12
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please five digit number :- "); // to calculate Palindrome number.
        int n = scanner.nextInt(); // to input a number for Palindrome or not.

        int a,r,s=0;
         a=n;
        while(n>0)
        {
            r=n%10;
            s=r+(s*10);
            n=n/10;

        }
        if (a==s)
            System.out.println(n +" is a Palindrome number.");
        else
            System.out.println(n +" is not a Palindrome number.");

    }
}
