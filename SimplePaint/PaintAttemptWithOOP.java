package SimplePaint;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Slider;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaintAttemptWithOOP extends Application {
    private MyCanvas myCanvas;
    private GraphicsContext gc;
    private MyActionListener actionListener;
    private MySlider sl;
    private Pane pane;
    private Scene scene;
    private ColorPicker cp;


    @Override
    public void start(Stage stage) {
        stage.setTitle("My paint");
        myCanvas = new MyCanvas(Dimension.WIDTH.getSize(), Dimension.HEIGHT.getSize());

        gc = myCanvas.getGraphicsContext2D();
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(1);

        cp = new ColorPicker();
        cp.setValue(Color.BLACK);

        cp.setOnAction(e -> {
            gc.setStroke(cp.getValue());
        });

        sl = new MySlider();

        pane = new Pane();
        scene = new Scene(pane, Dimension.WIDTH.getSize(), Dimension.HEIGHT.getSize());

        scene.setOnMousePressed(actionListener.getSetOnMousePressed(gc));

        scene.setOnMouseDragged(actionListener.getSetOnMouseDragged(gc));

        pane.getChildren().addAll(myCanvas.getCanvas(), cp, sl.getCustomSlider(myCanvas));

        stage.setScene(scene);
        stage.show();


    }

}



