package org.acme.geometry;

import java.util.ArrayList;
import java.util.Collections;

public class EnvelopeBuilder {
	private ArrayList <Double> listeX;
	private ArrayList <Double> listeY;
	
	public EnvelopeBuilder(){
		this.listeX = new ArrayList<Double>();
		this.listeY = new ArrayList<Double>();
	};
	
	
	public void insert(Coordinate c){
		this.listeX.add(c.getX());
		this.listeY.add(c.getY());
	}
	
	public Enveloppe build() {
        Coordinate c1 = new Coordinate(Collections.min(listeX,null),Collections.min(listeY,null));
        Coordinate c2 = new Coordinate(Collections.max(listeX,null),Collections.max(listeY,null));
        return new Enveloppe(c1,c2);
    }
	
}
