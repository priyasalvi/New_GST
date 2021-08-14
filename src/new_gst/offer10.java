package new_gst;

import java.util.Scanner;

public class offer10 {
	
	Scanner sc = new Scanner(System.in);
	double cart_total,dis10,dis_total;
	
	public double discount10()
	{

		dis10 = cart_total*0.1;
		dis_total = cart_total - dis10;
		System.out.println("Cart Total : "+ dis_total);
		return dis_total;
	}
	public static void main(String[] args)
	{
	
	offer10 o10 = new offer10();
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Enter Cart Total :	");
	double t = sc1.nextDouble();
	o10.cart_total = t;
	
	if(t>=1000.0)
	{	
		System.out.println("You have received 10% discount!\"");
		o10.discount10();
	}
	else
		System.out.println("You have received 5% discount!\"");
}
}

