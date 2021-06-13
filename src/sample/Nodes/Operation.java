package sample.Nodes;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Operation {

    final private double ARC = 50;
    private Rectangle oper1;

    public Operation(){
        oper1 = new Rectangle(120, 60, Color.LIGHTGREY);
        oper1.setX(120);
        oper1.setY(80);
        oper1.setArcHeight(ARC);
        oper1.setArcWidth(ARC);
    }

    public Rectangle getOper1() {
        return oper1;
    }
}
