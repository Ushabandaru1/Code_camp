package code_camp;
import java.util.*;
public class Sqrt_vthout_function {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
	int a = sc.nextInt();
	float sqrt, t = 0;
	sqrt = a/2;
	if (a == 1) 
		System.out.println("Square root of "+a+" is "+a);
	else
	{
	while(sqrt != t)
	{
		t = sqrt;
		sqrt = (a/t + t)/2;
	}
	System.out.println("Square root of "+a+" is "+sqrt);
	}
}
}