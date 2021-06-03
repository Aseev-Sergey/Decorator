package sample.Nodes;

import javafx.scene.shape.Circle;

public class Begin {

    private Circle filled;

    public Begin(){
        filled = new Circle(180, 20, 20);
    }

    public Circle getFilled() {
        return filled;
    }
}
