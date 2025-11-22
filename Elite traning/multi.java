import java.util.*;
public class multi
{
	public static void main(String[] args) {
	    Scanner Sc = new Scanner(System.in);
	    System.out.print("Numbers of lines to be printed: ");
	    int A = Sc.nextInt();
	    System.out.print("Enter the table: ");
	    int B = Sc.nextInt();
	    for (int i=1;i<=A;i++)
	    {
	        System.out.println(i + " * " + B + " = " + i*B);
	    }
	}
}