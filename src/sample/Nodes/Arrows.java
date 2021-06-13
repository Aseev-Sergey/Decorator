package sample.Nodes;

import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;

public class Arrows {

    private Polygon arrowBToOp, arrowOpToE;
    private Line lineBToOp, lineOptoE;

    public Arrows(){

        lineBToOp = new Line(180,40,180,70);

        lineOptoE = new Line(180, 140, 180, 700);

        arrowBToOp = new Polygon(new double[]{
                170, 70,
                190, 70,
                180, 80
        });

        arrowOpToE = new Polygon(new double[]{
                170, 700,
                190, 700,
                180, 710
        });


    }

    public Polygon getArrowBToOp() {
        return arrowBToOp;
    }

    public Line getLineBToOp() {
        return lineBToOp;
    }

    public Polygon getArrowOpToE() {
        return arrowOpToE;
    }

    public Line getLineOptoE() {
        return lineOptoE;
    }
}