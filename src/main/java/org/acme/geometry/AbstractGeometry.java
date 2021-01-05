package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractGeometry implements Geometry {

	private List<GeometryListener> listeners = new ArrayList<>();
	@Override
	public abstract Geometry clone();
	
	@Override
	public String asText() {
		WktVisitor visitor = new WktVisitor();
		this.accept(visitor);
		return visitor.getResult();
	}
	
	@Override
	public Enveloppe getEnvelope() {
		EnvelopeBuilder builder = new EnvelopeBuilder();
		accept(builder);
		return builder.build();
	}
	
	@Override
	public void addListener(GeometryListener listener) {
		this.listeners.add(listener);
	}
	
	protected void triggerChange(){
		for (GeometryListener listener : listeners) {
			listener.onChange(this);
		}
	};
}
