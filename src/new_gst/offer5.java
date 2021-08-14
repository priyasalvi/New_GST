package new_gst;
import java.util.Scanner;
public class offer5 {
		Scanner sc = new Scanner(System.in);
		double cart_total,dis5,dis_total;
	public double discount5()
		{

			dis5 = cart_total*0.05;
			dis_total = cart_total - dis5;
			System.out.println("Cart Total : "+ dis_total);
			return dis_total;
		}
		
		public static void main(String[] args)
		{
			offer5 o5 = new offer5();
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter cart total :  ");
			double t = sc1.nextDouble();
			o5.cart_total = t;
			
			if(t>=500.0)
			{	
				System.out.println("you have received 5% discount!");
				o5.discount5();
			}
			else
				System.out.println("No discount applied!");
		}
}	
		
