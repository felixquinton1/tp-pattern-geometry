package org.acme.geometry;

public class Enveloppe {
	private Coordinate bottomLeft;
	private Coordinate topRight;
	
	public Enveloppe(){
		this.bottomLeft = new Coordinate();
		this.topRight = new Coordinate();
	}
	
	public Enveloppe(Coordinate bottomLeft, Coordinate topRight){
		this.bottomLeft = bottomLeft;
		this.topRight = topRight;
	}
	
	public boolean isEmpty(){
		return ( this.getBottomLeft().isEmpty() || this.getTopRight().isEmpty());
	}

	public Coordinate getBottomLeft() {
		return bottomLeft;
	}

	public Coordinate getTopRight() {
		return topRight;
	}
	
	public double getXmax(){
		return Math.max(this.getBottomLeft().getX(),this.getTopRight().getX());
	}
	
	public double getYmax(){
		return Math.max(this.getBottomLeft().getY(),this.getTopRight().getY());
	}
	
	public double getXmin(){
		return Math.min(this.getBottomLeft().getX(),this.getTopRight().getX());
	}
	
	public double getYmin(){
		return Math.min(this.getBottomLeft().getY(),this.getTopRight().getY());
	}
}