package org.acme.geometry;

public class Point extends AbstractGeometry {
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
		assert(coordinate != null);
	    this.coordinate = coordinate;
	}
	
	public Coordinate getCoordinate() {
        return coordinate;
    }
	
	public double getX() {
		return coordinate.getX();
	}

	public double getY() {
		return coordinate.getY();
	}
	
	@Override
    public boolean isEmpty() {
        if ( Double.isNaN(this.getX()) || Double.isNaN(this.getY())) {
            return true;
        }
        else return false;
    }

	@Override
	public void translate(double dx, double dy) {
		// TODO Auto-generated method stub
		this.coordinate = new Coordinate(
				this.coordinate.getX() + dx,
				this.coordinate.getY() + dy
				);
	}
	
	@Override
    public Point clone() {
        return new Point(this.coordinate);
    }
	
//	@Override
//    public Enveloppe getEnvelope() {
//        EnvelopeBuilder builder = new EnvelopeBuilder();
//        builder.insert(this.getCoordinate());
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
