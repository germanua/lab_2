import java.util.HashMap;

/**
 * Represents a composite graphic object.
 * This class allows creating a composite graphic consisting of multiple points.
 */
public class CompositeGraphic implements GraphicObject {
    // HashMap to store points in the composite graphic
    private HashMap<String, GraphicObject> points = new HashMap<>();

    /**
     * Adds a point to the composite graphic.
     *
     * @param key    The key to identify the point.
     * @param point  The point to add.
     */
    public void addPoint(String key, GraphicObject point) {
        points.put(key, point);
    }

    /**
     * Draws the composite graphic at the specified coordinates.
     * This method iterates over all points in the composite graphic and draws them relative to the specified coordinates.
     *
     * @param x The x-coordinate.
     * @param y The y-coordinate.
     */
    @Override
    public void draw(int x, int y) {
        for (String key : points.keySet()) {
            GraphicObject point = points.get(key);
            point.draw(x, y); // Drawing each point with respect to the top-left corner (x, y)
        }
    }
}
