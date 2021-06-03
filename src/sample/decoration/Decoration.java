package sample.decoration;

import javafx.scene.layout.Pane;

public abstract class Decoration implements Diagram {

    private Diagram diagram;

    public Decoration(Diagram diagram){
        this.diagram = diagram;
    }

    @Override
    public void draw(Pane pane) {
        diagram.draw(pane);
    }
}
