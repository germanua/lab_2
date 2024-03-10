/**
 * Entry point for the raster graphics editor application.
 */
public class RasterGraphicsEditor {
    /**
     * Main method.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        GraphicObject point1 = GraphicObjectFactory.getGraphicObject("point");
        GraphicObject point2 = GraphicObjectFactory.getGraphicObject("point");
        GraphicObject compositeGraphic = GraphicObjectFactory.getGraphicObject("composite");
        GraphicObject rectangularImage = GraphicObjectFactory.getGraphicObject("rectangular");

        ((CompositeGraphic) compositeGraphic).addPoint("A", (Point) point1);
        ((CompositeGraphic) compositeGraphic).addPoint("B", (Point) point2);

        // Draw composite graphic object
        compositeGraphic.draw(11, 20);

        // Draw rectangular image
        rectangularImage.draw(30, 30);
    }
}
