package org.acme.geometry;

public class Point implements Geometry {
	private Coordinate coordinate;
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Je suis un point.";
	}
	
	public Point(){
		this.coordinate = new Coordinate();
	}
	
	public Point(Coordinate coordinate) {
	    this.coordinate = coordinate;
	}

	public double getX() {
		return coordinate.getX();
	}

	public double getY() {
		return coordinate.getY();
	}
	
}
