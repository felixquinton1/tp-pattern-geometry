package org.acme.geometry;

public class LogGeometryVisitor implements GeometryVisitor {
	
	public LogGeometryVisitor() {

    }
	
	@Override
    public void visit(Point point) {
        System.out.println("Je suis un point avec x=" + point.getX() +  " et y=" + point.getY());
    }

    @Override
    public void visit(LineString lineString) {
        System.out.println("Je suis une polyligne définie par " + lineString.getNumPoints() + " point(s)");
    }

}
