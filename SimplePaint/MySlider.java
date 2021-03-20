package SimplePaint;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Slider;

public class MySlider {
    private Slider slider;



    public MySlider() {
        slider = new Slider();

    }

    public Slider getCustomSlider(MyCanvas myCanvas) {
        slider.setMin(1);
        slider.setMax(10);
        slider.setLayoutX(150);
        slider.setLayoutY(5);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.valueProperty().addListener(e -> {
            double value = slider.getValue();
            myCanvas.getGraphicsContext2D().setLineWidth(value);
        });
        return slider;
}
}
