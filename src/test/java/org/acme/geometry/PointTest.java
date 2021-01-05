package org.acme.geometry;


import org.junit.Assert;
import org.junit.Test;

public class PointTest {
public static final double EPSILON = 1.0e-15;
	
	@Test
	public void testDefaultConstructor(){
		Point p = new Point();
		Assert.assertTrue(p.isEmpty());
		Assert.assertEquals(Double.NaN, p.getX(), EPSILON);
		Assert.assertEquals(Double.NaN, p.getY(), EPSILON);
	}
		
	@Test
	public void testConstructorXY(){
		Coordinate c = new Coordinate(3.0,4.0);
		Point p = new Point(c);
		Assert.assertEquals(3.0, p.getX(), EPSILON);
		Assert.assertEquals(4.0, p.getY(), EPSILON);
	}
	
	@Test
	public void testGetType(){
		Coordinate c = new Coordinate(3.0,4.0);
		Point p = new Point(c);
		Assert.assertFalse(p.isEmpty());
		Assert.assertEquals(p.getType(),"Je suis un point.");
	}
	
	@Test
    public void testTranslate() {
	 Coordinate c = new Coordinate(3.0,4.0);
		Point p = new Point(c);
		p.translate(1.0,1.0);
		Assert.assertEquals(4.0, p.getX(), EPSILON);
		Assert.assertEquals(5.0, p.getY(), EPSILON);
    }
	
	@Test
    public void testClone() {
	 Coordinate c = new Coordinate(3.0,4.0);
		Point p = new Point(c);
		Point p2 = p.clone();
		Assert.assertNotSame(p,p2);
		Assert.assertEquals(p2.getX(), p.getX(), EPSILON);
		Assert.assertEquals(p2.getY(), p.getY(), EPSILON);
    }
	
	@Test
    public void testGetEnvelope(){
        Point a = SampleFactory.createPointA();
        Assert.assertEquals(3.0,a.getEnvelope().getTopRight().getX(), EPSILON);
        Assert.assertEquals(4.0,a.getEnvelope().getTopRight().getY(), EPSILON);
        Assert.assertEquals(3.0,a.getEnvelope().getBottomLeft().getX(), EPSILON);
        Assert.assertEquals(4.0,a.getEnvelope().getBottomLeft().getY(), EPSILON);
    }
}
