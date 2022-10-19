import java.util.Scanner;

public class Print10Num01
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please any number between 1 to 90 :- "); // first number to start range of ten digit from.
        int num1 = scanner.nextInt(); // First number where the range start from.

        System.out.print("Please any number between 11 to 100 :- "); // first number to start range of ten digit from.
        int num2 = scanner.nextInt(); // second number where the range end.

        int num3 = 10; // to add max number to num1
        int num4 = num1+num3; // this will be number after addition of 10 on first number

        for (int i = num1; i < num2; i++)
        {
            System.out.println(num1+++1);
            if (i>= num4) break;

        }

    }


}
