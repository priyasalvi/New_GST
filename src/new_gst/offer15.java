package new_gst;

import java.util.Scanner;

public class offer15 {
	Scanner sc = new Scanner(System.in);
	double cart_total,dis15,dis_total;
	
	public double discount15()
	{

		dis15 = cart_total*0.15;
		dis_total = cart_total - dis15;
		System.out.println("Cart Total : "+ dis_total);
		return dis_total;
	}
	public static void main(String[] args)
	{
	
	offer15 o15 = new offer15();
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Enter Cart Total :	");
	double t = sc1.nextDouble();
	o15.cart_total = t;
	
	if(t>=1500.0)
	{	
		System.out.println("You have received 15% discount!\"");
		o15.discount15();
	}
	else
		System.out.println("You have received no discount!\"");
}
}
