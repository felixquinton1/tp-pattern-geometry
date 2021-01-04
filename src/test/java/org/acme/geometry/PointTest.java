package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
public static final double EPSILON = 1.0e-15;
	
	@Test
	public void testDefaultConstructor(){
		Point p = new Point();
		Assert.assertEquals(0.0, p.getX(), EPSILON);
		Assert.assertEquals(0.0, p.getY(), EPSILON);
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
		Assert.assertEquals(p.getType(),"Je suis un point.");
	}
}
