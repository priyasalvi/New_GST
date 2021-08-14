package new_gst;

public class my_cart1 extends Bill {
	String[] mycart1 = {"milk","cheese","cake"};
	double mgst,cgst,chgst,mytotal;
	int milk_qnty = 2, cheese_qnty = 10, cake_qnty =10,milk_cost = 50,cake_cost = 100,cheese_cost=100;
	public double calc_mycart5()
	{
		mgst = milk_qnty*milk_cost*0.05;
		return mgst;
	}
	public double calc_mycart12()
	{
		chgst = cheese_qnty*cheese_cost*0.12;
		return chgst;
	}
	public double calc_mycart18()
	{
		cgst=cake_qnty*cake_cost*0.18;
		return cgst;
	}
	public double calc_mycart()
	{
		mytotal = mgst+cgst+chgst;
		System.out.println(mytotal);
		return mytotal;	
	}
	
	public void mycart_disp()
	{
		System.out.println("My cart 5 % Total is : "+mgst);
		System.out.println("My cart 12 % Total is : "+chgst);
		System.out.println("My cart 18 % Total is : "+cgst);

		System.out.println("My cart Total is : "+mytotal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		my_cart1 mc = new my_cart1();
		mc.calc_mycart5();
		mc.calc_mycart12();
		mc.calc_mycart18();
		mc.calc_mycart();
		mc.mycart_disp();
	}

}
