package org.acme.geometry;
import org.junit.Test;

public class LogGeometryVisitorTest {

    @Test
    public void testGeometryVisitor(){
        LogGeometryVisitor visitor = new LogGeometryVisitor();
        Geometry geometry = SampleFactory.createPointA();
        geometry.accept(visitor);
        
        Geometry geometry2 = SampleFactory.createLineStringOA();
        geometry2.accept(visitor);
    }

}