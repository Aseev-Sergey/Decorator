package sample.Nodes;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class End {

    private Circle filled;
    private Circle inner;
    private Circle outer;

    public End(){
        outer = new Circle(180, 460, 20);
        inner = new Circle(outer.getCenterX(), outer.getCenterY(), outer.getRadius()-5, Color.WHITE);
        filled = new Circle(outer.getCenterX(), outer.getCenterY(), outer.getRadius()-10);
    }

    public Circle getFilled() {
        return filled;
    }

    public Circle getInner() {
        return inner;
    }

    public Circle getOuter() {
        return outer;
    }
}
