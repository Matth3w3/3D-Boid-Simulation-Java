import java.awt.*;
public class Main {
    
    public static void main(String[] args) {
        int boidCount = 750;
        double boidSize = 2.5;
        Vec3 maxBounds = new Vec3(200, 200, 200);
        Vec3 minBounds = Vector.mult(maxBounds, -1);
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        int height = (int) size.getHeight() - 200;
        int width = (int) (size.getWidth()) - 110;
        BoidSimulation sim = new BoidSimulation(boidCount, boidSize, maxBounds, minBounds, width, height);
        sim.setCamera(0.1, 1000, 120, new Vec3(0, 0, minBounds.z*1.5));
        sim.start();
    }
}
