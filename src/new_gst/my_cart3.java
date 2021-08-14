package new_gst;

public class my_cart3 {
	String[] mycart1 = {"vegetable","cheese","cake"};
	double vgst,cgst,chgst,mytotal;
	int vegetable_qnty = 5, cheese_qnty = 1, cake_qnty =10,milk_cost = 50,cake_cost = 100,cheese_cost=100;
	public double calc_mycart5()
	{
		vgst = vegetable_qnty*milk_cost*0.05;
		return vgst;
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
		mytotal = vgst+cgst+chgst;
		System.out.println(mytotal);
		return mytotal;	
	}
	
	public void mycart_disp()	{
		System.out.println("My cart 5 % Total is : "+vgst);
		System.out.println("My cart 12 % Total is : "+chgst);
		System.out.println("My cart 18 % Total is : "+cgst);

		System.out.println("My cart Total is : "+mytotal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		my_cart3 mc3 = new my_cart3();
		mc3.calc_mycart5();
		mc3.calc_mycart12();
		mc3.calc_mycart18();
		mc3.calc_mycart();
		mc3.mycart_disp();
	}

}
