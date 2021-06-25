package code_camp;
import java.util.*;
public class Rotatd_string {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two strings");
    String s1 = sc.next();
    String s2 = sc.next();
    if (s1.length() !=  s2.length())
    {
    	System.out.println("No");
    }
    else
    {
        String s3 = s1 + s1;
        if(s3.contains(s2))
        {
        	System.out.println("Yes");
        }
        else
        {
        	System.out.println("No");
        }
    }
	}
}
