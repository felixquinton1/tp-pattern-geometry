package org.acme.geometry;


import java.util.ArrayList;

public class LineString extends AbstractGeometry {
	ArrayList <Point> points;
	
	public LineString() {
        this.points = new ArrayList<Point>();
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
        triggerChange();
	}
	
	@Override
    public LineString clone() {
		ArrayList <Point> newPoints = new ArrayList<>(getNumPoints());
		for(Point point : points) {
			newPoints.add(point.clone());
		}
        return new LineString(newPoints);
    }
	
//	@Override
//    public Enveloppe getEnvelope() {
//        EnvelopeBuilder builder = new EnvelopeBuilder();
//        for(Point pt : this.points) {
//            builder.insert(pt.getCoordinate());
//        }
//        Enveloppe result = builder.build();
//        return result;
//    }

	@Override
	public void accept(GeometryVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void accept(WktVisitor visitor) {
		visitor.visit(this);
		
	}

}
