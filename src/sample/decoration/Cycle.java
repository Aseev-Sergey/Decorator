package sample.decoration;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Cycle extends Decoration {

    private Rectangle outerCycle, innerCycle, clearRect;
    private Polygon arrowOutToIn, arrowSolToOut, arrowOutToE;
    private Line lineOutToIn, lineInToOut1, lineInToOut2, lineInToOut3,
            lineOutToE1, lineOutToE2, lineOutToE3, lineOutToE4;

    public Cycle(Diagram diagram) {
        super(diagram);
    }

    @Override
    public void draw(Pane pane) {
        super.draw(pane);
        printCycle(pane);
    }

    private void printCycle(Pane pane){

        outerCycle = new Rectangle(100, 100, Color.LIGHTGREY);
        outerCycle.setX(130);
        outerCycle.setY(460);
        outerCycle.setRotate(45);

        lineOutToIn = new Line(180, 580, 180, 600);
        arrowOutToIn = new Polygon(new double[]{
                170, 600,
                190, 600,
                180, 610
        });

        innerCycle = new Rectangle(120,60, Color.LIGHTGREY);
        innerCycle.setX(120);
        innerCycle.setY(610);

        clearRect = new Rectangle(2, 10, Color.WHITE);
        clearRect.setX(179);
        clearRect.setY(670);

        lineInToOut1 = new Line(120, 640, 60, 640);
        lineInToOut2 = new Line(60,640, 60, 420);
        lineInToOut3 = new Line(60, 420, 180, 420);

        lineOutToE1 = new Line(250.7, 509.3, 300, 509.3);
        lineOutToE2 = new Line(300, 509.3, 300, 680);
        lineOutToE3 = new Line(300, 680, 180, 680);
        lineOutToE4 = new Line(180, 680, 180, 700);

        arrowOutToE = new Polygon(new double[]{
                170, 700,
                190, 700,
                180, 710
        });

        arrowSolToOut = new Polygon(new double[]{
                170, 430,
                190, 430,
                180, 440
        });

        pane.getChildren().addAll(outerCycle, lineOutToIn, arrowOutToIn, innerCycle, lineInToOut1, lineInToOut2,
                lineInToOut3, lineOutToE1, lineOutToE2, lineOutToE3, lineOutToE4, arrowOutToE, arrowSolToOut, clearRect);
    }
}
