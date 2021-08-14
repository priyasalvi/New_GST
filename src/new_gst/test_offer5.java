package new_gst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import junit.framework.TestCase;

import new_gst.offer5;

public class test_offer5 extends TestCase {
	offer5 o5 = new offer5();

	public final void testDiscount5() {
		o5.cart_total = 510.0;
		double dis = o5.discount5();
		assertEquals(484.5,dis);
	}

}
