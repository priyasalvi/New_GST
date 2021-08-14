package new_gst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import junit.framework.TestCase;
import new_gst.my_cart2;

public class test2_cart extends TestCase {
	my_cart2 m2 = new my_cart2();
	public final void testCalc_mycart5() {
		double res5 = m2.calc_mycart5();
		//	System.out.println(res5);
			assertEquals(5.0,res5);
	}

	public final void testCalc_mycart12() {
		double res12 = m2.calc_mycart12();
		assertEquals(60.0,res12);
	}

	public final void testCalc_mycart18() {
		double res18 = m2.calc_mycart18();
		assertEquals(180.0,res18);
	}

}
