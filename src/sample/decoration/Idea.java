package sample.decoration;

import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class Idea extends Decoration {

    private Text[] textIdea;

    public Idea(Diagram diagram) {
        super(diagram);
    }

    @Override
    public void draw(Pane pane) {
        super.draw(pane);
        printIdea(pane);
    }

    private void printIdea(Pane pane){
        textIdea = new Text[]{
                new Text(130, 110, "Предложить идею"),
                new Text(140, 250, "Принять идею?"),
                new Text(249, 248, "Да"),
                new Text(95, 248, "Нет"),
                new Text(250, 320, "Передать\nпредложение\nдальше")
        };
        pane.getChildren().addAll(textIdea[0], textIdea[1], textIdea[2], textIdea[3], textIdea[4]);
    }
}
