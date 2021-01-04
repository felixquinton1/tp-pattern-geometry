package org.acme.geometry;


import java.util.ArrayList;

public class LineString implements Geometry {
	ArrayList <Point> points;
	
	public LineString() {
        ArrayList<Point> l = new ArrayList<Point>();
        l.add(new Point());
        this.points =l;
    }
	
	public LineString(ArrayList <Point> points) {
	    this.points = points;
	}
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Je suis une LineString.";
	}
	
	public int getNumPoints() {
		return this.points.size();
	}
	
	public Point getPointN(int n) {
		return this.points.get(n);
	}

}
