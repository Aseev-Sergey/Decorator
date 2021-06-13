package sample.decoration;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class Branch extends Decoration {

    private Rectangle  oper2, sol, clearRect;
    private Line lineOpToSol, lineSolToE1, lineSolToE2, lineSolToE3, lineSolToE4,
    lineSolToOp1, lineSolToOp2, lineOpToE1, lineOpToE2;
    private Polygon arrowOpToSol, arrowSolToOp;

    public Branch(Diagram diagram) {
        super(diagram);
    }

    @Override
    public void draw(Pane pane) {
        super.draw(pane);
        printBranch(pane);
    }

    private void printBranch(Pane pane) {
        oper2 = new Rectangle(120, 60, Color.LIGHTGREY);
        oper2.setX(240);
        oper2.setY(300);
        oper2.setArcHeight(50);
        oper2.setArcWidth(50);

        sol = new Rectangle(100, 100, Color.LIGHTGREY);
        sol.setX(130);
        sol.setY(200);
        sol.setRotate(45);

        lineOpToSol = new Line(180,140,180,170);

        arrowOpToSol = new Polygon(new double[]{
                170, 170,
                190, 170,
                180, 180
        });

        lineSolToOp1 = new Line(250.7, 250.7, 300, 250.7);
        lineSolToOp2 = new Line(300, 250.7, 300, 300);

        arrowSolToOp = new Polygon(new double[]{
                290, 290,
                310, 290,
                300, 300
        });

        lineSolToE1 = new Line(109.3, 250.7, 60, 250.7);
        lineSolToE2 = new Line(60, 250.7, 60, 400);
        lineSolToE3 = new Line(60, 400, 180, 400);
        lineSolToE4 = new Line(180, 400, 180, 430);

        clearRect = new Rectangle(2, 78, Color.WHITE);
        clearRect.setX(179);
        clearRect.setY(320);

        lineOpToE1 = new Line(300,360,300,400);
        lineOpToE2 = new Line(300,400,180,400);
        pane.getChildren().addAll(oper2, lineOpToSol, lineSolToE1, lineSolToE2, lineSolToE3, lineSolToE4,
                lineSolToOp1, lineSolToOp2, lineOpToE1, lineOpToE2, arrowOpToSol, arrowSolToOp, sol, clearRect);
    }
}
