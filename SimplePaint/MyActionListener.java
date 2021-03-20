package SimplePaint;

import javafx.event.EventHandler;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;

public class MyActionListener {
    private MySetOnMousePressed mySetOnMousePressed;
    private MySetOnMouseDragged mySetOnMouseDragged;
    private GraphicsContext gc;

    public MyActionListener(GraphicsContext gc) {
        mySetOnMousePressed = new MySetOnMousePressed();
        this.gc = gc;
    }

    private class MySetOnMousePressed implements EventHandler<MouseEvent> {
        @Override
        public void handle(MouseEvent mouseEvent) {
            gc.beginPath();
            gc.lineTo(mouseEvent.getSceneX(), mouseEvent.getSceneY());
            gc.stroke();
        }
    }

    public MySetOnMousePressed getSetOnMousePressed(GraphicsContext gc) {
        return mySetOnMousePressed;
    }

    private class MySetOnMouseDragged implements EventHandler<MouseEvent> {
        @Override
        public void handle(MouseEvent mouseEvent) {
            gc.lineTo(mouseEvent.getSceneX(), mouseEvent.getSceneY());
            gc.stroke();
        }
    }

    public MySetOnMouseDragged getSetOnMouseDragged(GraphicsContext gc) {
        return mySetOnMouseDragged;
    }

}
