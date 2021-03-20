package SimplePaint;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class MyCanvas {
    private final Canvas canvas;

    public MyCanvas(int width, int height) {
        this.canvas = new Canvas(width, height);
    }

   public Canvas getCanvas() {
        return canvas;
    }

    public GraphicsContext getGraphicsContext2D() {
        return canvas.getGraphicsContext2D();
    }
}

