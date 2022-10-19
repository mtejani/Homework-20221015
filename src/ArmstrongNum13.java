import java.util.Scanner;

public class ArmstrongNum13
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please five digit number :- "); // to print armstrong number verification.
        int n = scanner.nextInt(); // to input a number for to find armstrongnumber or not.

        int a,r,arm=0; // temp summ
        a=n; //temp int
        while(n>0)
        {
            r=n%10;
            arm=(r*r*r)+arm;
            n=n/10;

        }
        if (a==arm)
            System.out.println("The number " + n +" is a Armstrong number"); //print output
        else
            System.out.println("The number " + n +" is Not Armstrong number"); //print output

    }
}