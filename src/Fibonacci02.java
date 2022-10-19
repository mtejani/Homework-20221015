import java.util.Scanner;

public class Fibonacci02
{

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please any number of term your would like output :- "); // term number of sequence series.
        int term = scanner.nextInt(); // First number where first number where the sequence of number start.
        int a=0,b=1,c;


        for (int i = 1; i < term; i++)
        {
           System.out.print(a +" "); // series number with spaces
            c=a+b; // a+b to bring c for temp addition
            a=b;
            b=c;
        }


    }


}
