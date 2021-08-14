package new_gst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import junit.framework.TestCase;
import new_gst.my_cart3;
public class test3_cart extends TestCase {
	my_cart3 m3 = new my_cart3();
	public final void testCalc_mycart5() {
		double res5 = m3.calc_mycart5();
		//	System.out.println(res5);
			assertEquals(12.5,res5);
	}

	public final void testCalc_mycart12() {
		double res12 = m3.calc_mycart12();
		assertEquals(12.0,res12);
	}

	public final void testCalc_mycart18() {
		double res18 = m3.calc_mycart18();
		assertEquals(180.0,res18);
	}

}
