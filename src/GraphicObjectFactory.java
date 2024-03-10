import java.util.HashMap;

/**
 * Factory class for creating and managing graphic objects.
 */
public class GraphicObjectFactory {
    private static final HashMap<String, GraphicObject> graphicObjects = new HashMap<>();

    /**
     * Retrieves or creates a graphic object of the specified type.
     *
     * @param type The type of graphic object.
     * @return The graphic object.
     */
    public static GraphicObject getGraphicObject(String type) {
        GraphicObject graphicObject = graphicObjects.get(type);

        if (graphicObject == null) {
            // Create a new instance if not found in the cache
            if (type.equals("point")) {
                graphicObject = new Point();
            } else if (type.equals("composite")) {
                graphicObject = new CompositeGraphic();
            } else if (type.equals("rectangular")) {
                graphicObject = new RectangularImage(60, 40); // Example dimensions
            }
            graphicObjects.put(type, graphicObject);
        }

        return graphicObject;
    }
}
