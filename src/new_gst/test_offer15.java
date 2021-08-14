package new_gst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import junit.framework.TestCase;
import new_gst.offer15;
public class test_offer15 extends TestCase {
	offer15 o15 = new offer15();

	public final void testDiscount15() {
		o15.cart_total = 1510.0;
		double dis = o15.discount15();
		assertEquals(1283.5,dis);	}

}
