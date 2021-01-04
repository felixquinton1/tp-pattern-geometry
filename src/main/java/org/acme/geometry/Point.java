package org.acme.geometry;

public class Point implements Geometry {
	private Coordinate coordinate;
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}
	
//	public Point(){
//		this.coordinate =  ;
//	}
	
	public Point(Coordinate coordinate) {
	    this.coordinate = coordinate;
	}
	
}
