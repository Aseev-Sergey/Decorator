package sample.decoration;

import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class Decor extends Decoration {

    private Text[] textDecor;

    public Decor(Diagram diagram) {
        super(diagram);
    }

    @Override
    public void draw(Pane pane) {
        super.draw(pane);
        printDecor(pane);
    }

    private void printDecor(Pane pane) {
        textDecor = new Text[]{
                new Text(130, 110, "Нарядить ёлку"),
                new Text(140, 250, "Есть игрушки?"),
                new Text(250, 330, "Наряжать ёлку")
        };
        pane.getChildren().addAll(textDecor[0], textDecor[1], textDecor[2]);
    }
}
