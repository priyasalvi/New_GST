package new_gst;

public class my_cart2 {
	String[] mycart1 = {"bread","butter","biscuits"};
	double bgst,btgst,bsgst,mytotal;
	int bread_qnty = 2, butter_qnty = 5, biscuits_qnty =10,bread_cost = 50,butter_cost = 100,biscuits_cost=100;
	public double calc_mycart5()
	{
		bgst = bread_qnty*bread_cost*0.05;
		return bgst;
	}
	public double calc_mycart12()
	{
		btgst = butter_qnty*butter_cost*0.12;
		return btgst;
	}
	public double calc_mycart18()
	{
		bsgst=biscuits_qnty*biscuits_cost*0.18;
		return bsgst;
	}
	public double calc_mycart()
	{
		mytotal = bgst+btgst+bsgst;
		System.out.println(mytotal);
		return mytotal;	
	}
	
	public void mycart_disp()
	{
		System.out.println("My cart 5 % Total is : "+bgst);
		System.out.println("My cart 12 % Total is : "+btgst);
		System.out.println("My cart 18 % Total is : "+bsgst);

		System.out.println("My cart Total is : "+mytotal);
	}
	public static void main(String[] args)
	{
		System.out.println("hi");
		my_cart2 mc2 = new my_cart2();
		mc2.calc_mycart5();
		mc2.calc_mycart12();
		mc2.calc_mycart18();
		mc2.calc_mycart();
		mc2.mycart_disp();
	}
}
