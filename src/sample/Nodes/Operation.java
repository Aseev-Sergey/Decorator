package sample.Nodes;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Operation {

    final private double ARC = 50;
    private Rectangle oper1, oper2;

    public Operation(){
        oper1 = new Rectangle(120, 60, Color.WHITE);
        oper1.setX(120);
        oper1.setY(80);
        oper1.setArcHeight(ARC);
        oper1.setArcWidth(ARC);
        oper2 = new Rectangle(120, 60, Color.WHITE);
        oper2.setX(240);
        oper2.setY(300);
        oper2.setArcHeight(ARC);
        oper2.setArcWidth(ARC);
    }

    public Rectangle getOper1() {
        return oper1;
    }

    public Rectangle getOper2() {
        return oper2;
    }
}
