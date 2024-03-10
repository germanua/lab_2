/**
 * Represents a point graphic object.
 */
public class Point implements GraphicObject {
    /**
     * Draws the point at the specified coordinates.
     *
     * @param x The x-coordinate.
     * @param y The y-coordinate.
     */
    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing point at (" + x + ", " + y + ")");
    }
}
