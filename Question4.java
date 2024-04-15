import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    int integer = in.nextInt();
    for(int i=1; i<=integer; i++)
    {
      for(int j=integer; j>=1; j--)
      {
        if(j>=i)
        System.out.println("*");
      }
      System.out.println();
    }
    
  }
}
