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
		assert(points != null);
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
	
	@Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        if (this.points.size()==0) {
            return true;
        }
        else {
            return false;
        }
    }

	@Override
	public void translate(double dx, double dy) {
		// TODO Auto-generated method stub
        for (int i = 0; i < this.points.size(); i++) {
            this.points.get(i).translate(dx,dy);
        }
	}
	
	@Override
    public LineString clone() {
        return new LineString(this.points);
    }

}
