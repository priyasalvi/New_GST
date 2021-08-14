package new_gst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import junit.framework.TestCase;

import new_gst.offer10;

public class test_offer10 extends TestCase {
	offer10 o10 = new offer10();
	public final void testDiscount10() {
		o10.cart_total = 1010.0;
		double dis = o10.discount10();
		assertEquals(909.0,dis);
	}

}
