package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class GeometryWithCachedEnvelopeTest {
	
	@Test 
    public void testGeometryWithCachedEnvelopePoint(){
        Geometry g = SampleFactory.createPointA();
        g = new GeometryWithCachedEnvelope(g);
        Enveloppe a = g.getEnvelope() ; // calcul et stockage dans cachedEnvelope
        Enveloppe b = g.getEnvelope() ; // renvoi de cachedEnvelope
        Assert.assertSame(a,b);
    }

    @Test 
    public void testGeometryWithCachedEnvelopeLineString(){
        Geometry g = SampleFactory.createLineStringOA();
        g = new GeometryWithCachedEnvelope(g);
        Enveloppe a = g.getEnvelope() ; // calcul et stockage dans cachedEnvelope
        Enveloppe b = g.getEnvelope() ; // renvoi de cachedEnvelope
        Assert.assertSame(a,b);
    }
}
