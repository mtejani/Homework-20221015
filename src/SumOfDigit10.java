import java.util.Scanner;

public class SumOfDigit10 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please five digit number :- "); // take a five digit from user.
        int n = scanner.nextInt(); // user to enter any five digit.

        int counter = 0; //temp counter
        int r, sum=0; //temp int

        while (n> 0)
        {
            n=n/10;
            counter++; //count numbers
        }

        System.out.println(counter+" No of digit contain in "+n); //to print loop
        System.out.println();
        {  r=n%10;
            sum=sum+r;//sum of temp number plus n
            n=n/10; //divide with 10 to find remain

         }
        System.out.println("Sum of digit "+n+ " is " +sum); //display final output

    }
}
