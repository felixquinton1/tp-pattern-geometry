package org.acme.geometry;

import org.junit.Test;

import org.junit.Assert;

public class WktVisitorTest {
	 @Test
	    public void testWktVisitorLineString(){
		    WktVisitor visitor = new WktVisitor();
		    Geometry geometry = SampleFactory.createPointA();;
		    geometry.accept(visitor);
		    Assert.assertEquals( "POINT(3.0 4.0)", visitor.getResult() );
		   }
	 
	 @Test
	    public void testWktVisitorPoint(){
		    WktVisitor visitor = new WktVisitor();
	        Geometry geometry2 = SampleFactory.createLineStringOA();
	        geometry2.accept(visitor);
	        Assert.assertEquals( "LINESTRING(0.0 1.0,3.0 4.0)", visitor.getResult() );
	    }
}
