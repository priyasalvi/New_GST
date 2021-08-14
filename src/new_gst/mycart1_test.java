package new_gst;

import new_gst.my_cart1;
import junit.framework.TestCase;

public class mycart1_test extends TestCase {
	my_cart1 m = new my_cart1();
	public void testCalc_mycart5() {
		double res5 = m.calc_mycart5();
	//	System.out.println(res5);
		assertEquals(5.0,res5);
	}

	public void testCalc_mycart18() {
		double res18 = m.calc_mycart18();
		assertEquals(180.0,res18);
	}

	public void testCalc_mycart12() {
		double res12 = m.calc_mycart12();
		assertEquals(120.0,res12);
	}

}
