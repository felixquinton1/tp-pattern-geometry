package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class EnveloppeTest {
	
	public static final double EPSILON = 1.0e-15;
	@Test
    public void testEnvelopeIsEmpty() {
        Enveloppe eOA = SampleFactory.createEnvelopeOA();
        Assert.assertTrue(!eOA.isEmpty());

        Enveloppe e = new Enveloppe();
        Assert.assertTrue(e.isEmpty());
    }
	
	@Test
    public void testEnveloppeGetXmax() {
        Enveloppe eOA = SampleFactory.createEnvelopeOA();
        Assert.assertEquals(eOA.getXmax(),3.0, EPSILON);
        Assert.assertEquals(eOA.getYmax(),4.0, EPSILON);
        Assert.assertEquals(eOA.getXmin(),0.0, EPSILON);
        Assert.assertEquals(eOA.getYmin(),1.0, EPSILON);
    }
}
