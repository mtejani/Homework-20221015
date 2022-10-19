import java.util.Scanner;

public class Dividedby07
{

      public static void main(String[] args)
        {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Please a number to find if it is divisible by 3 or 5 or by both 3 & 5 :- "); // display a command for user to enter number.
            int n = scanner.nextInt(); // to input a number for calculation.


            System.out.println("Numbers divisible by 3: "); //first calculation to divide with 3
            for (int i =1; i <=n; i++)
            {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            System.out.println();
            System.out.println("Numbers divisible by 5: "); // calculation to divide with 5

            for (int i =1; i <=n; i++)
            {
                if (i % 5 == 0)
                {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            System.out.println();
            System.out.println("Numbers divisible by 3 & 5: "); //first calculation to divide with 3 & 5 both together.

                for (int i= 1; i <= n; i++)
                {
                    if (i % 5 == 0 && i % 3 == 0)
                    {
                        System.out.print(i + ", ");
                    }

                }
            System.out.println();

        }
}

