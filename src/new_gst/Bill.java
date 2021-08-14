package new_gst;
import java.util.Scanner;


public class Bill {
	String[] gst5 = { "milk", "bread", "vegetable"};
	String[] gst12 = { "meat", "butter", "cheese"};
	String[] gst18 = { "pasta", "biscuits", "cake"};
	int ans;
	int quant;
	int i = 0;
	int gst5len = gst5.length;
	int gst12len = gst12.length;
	int gst18len = gst18.length;
	double gst_5,gst_12,gst_18,subt5 = 0,subt12=0,subt18=0,t5,t12,t18,tgst,total;
	Scanner sc = new Scanner(System.in);
	public void item_disp()
	{
		for(i=0;i<gst5len;i++)
			System.out.println("Item with 5 % gst : "+gst5[i]);
		for(i=0;i<gst12len;i++)
			System.out.println("Item with 12 % gst : "+ gst12[i]);
		for(i=0;i<gst18len;i++)
			System.out.println("Item with 18 % gst :"+ gst18[i]);
	}
	public void cart_5()
	{
		System.out.println("Enter items to add in cart : \nEnter 1 for yes");
		for(i=0;i<gst5len;i++)
		{
			System.out.println(gst5[i]);
			 ans = sc.nextInt();
			 if(ans == 1)
			 {
				 System.out.println("Enter Quantity : ");
				 quant = sc.nextInt();
				 subt5 = subt5+ quant* 50;
			}
			 else
				 continue;
		}
	}
	public void gst5_cart()
	{
		gst_5 = subt5*0.05;
		t5 = subt5 + gst_5;
		System.out.println("Total 5% gst : "+gst_5);
		System.out.println("Subtotal : " +t5);
	}	
	public void cart12()
	{
		
		for(i=0;i<gst12len;i++)
		{
			System.out.println(gst12[i]);
			 ans = sc.nextInt();
			 if(ans == 1)
			 {
				 System.out.println("Enter Quantity : ");
				 quant = sc.nextInt();
				 subt12 = subt12+ quant* 100;
			}
			 else
				 continue;
		}
	}
	public void gst12_Cart()
	{
		gst_12 = subt12*0.12;
		t12 = subt12 + gst_12;
		System.out.println("Total 12% gst : "+gst_12);
		System.out.println("Subtotal : " +t12);
	}
	public void cart18()
	{
		for(i=0;i<gst18len;i++)
		{
			System.out.println(gst18[i]);
			 ans = sc.nextInt();
			 if(ans == 1)
			 {
				 System.out.println("Enter Quantity : ");
				 quant = sc.nextInt();
				 subt18 = subt18+ quant* 100;
			}
			 else
				 continue;
		}
	}
	public void gst18_cart()
	{
		
		gst_18 = subt18*0.18;
		t18 = subt18 + gst_18;
		System.out.println("Total 18% gst : " +gst_18);
		System.out.println("Subtotal : " +t18);
	}
	public void cart_total()
	{
		total = t5 + t18 + t12;
		tgst = gst_5 + gst_12 +gst_18;
		System.out.println("Total gst applied: "+tgst);
		System.out.println("Total bill is : "+total);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bill b = new Bill();
		b.item_disp();
		b.cart_5();
		b.gst5_cart();
		b.cart12();
		b.gst12_Cart();
		b.cart18();
		b.gst18_cart();
		b.cart_total();
		
	}

}
