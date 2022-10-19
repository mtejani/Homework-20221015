import java.util.Scanner;

public class MultiplicationDoWhile15 {
   // Writing a program to print multiplication table using
   //DO WHILE loop
    public static void main(String[] args)
    {
        System.out.print("Multiplication T able\n");  // for next line display
        int i=1;
        while(i<=10)  // vertically
        {
            int j=1;
            while(j<=3) // Horizontal
            {
                System.out.print(i*j+"\t");  // multiplication
                j++;  // increment to j value
            }
            i++;   // then increment to i value
            System.out.println();  // blank print ln
        }
    }
}