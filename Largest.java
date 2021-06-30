package code_camp;
import java.util.*;
public class Largest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number and digit");
		int number = sc.nextInt();
		int digit = sc.nextInt();
		
		char c = Integer.toString(digit) .charAt(0);
		int i;
		for(i = number; i > 0 ; i--)
		{
		  if(Integer.toString(i) .indexOf(c)== -1)
		  {
			  System.out.println(i);
			  break;
		  }
		}
    }
}
