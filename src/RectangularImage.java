/**
 * Represents a rectangular image graphic object.
 */
public class RectangularImage implements GraphicObject {
    private int width;
    private int height;

    /**
     * Constructs a rectangular image with the specified width and height.
     *
     * @param width  The width of the rectangular image.
     * @param height The height of the rectangular image.
     */
    public RectangularImage(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Draws the rectangular image at the specified coordinates.
     *
     * @param x The x-coordinate.
     * @param y The y-coordinate.
     */
    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing rectangular image (width: " + width + ", height: " + height + ") at (" + x + ", " + y + ")");
    }
}
