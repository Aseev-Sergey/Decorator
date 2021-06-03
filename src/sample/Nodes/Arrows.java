package sample.Nodes;

import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;

public class Arrows {

    private Polygon arrowBToOp, arrowOpToSol, arrowSolToE, arrowSolToOp;
    private Line lineBToOp, lineOpToSol, lineSolToE1, lineSolToE2, lineSolToE3, lineSolToE4,
    lineSolToOp1, lineSolToOp2, lineOpToE1, lineOpToE2;

    public Arrows(){

        lineBToOp = new Line(180,40,180,70);

        arrowBToOp = new Polygon(new double[]{
                170, 70,
                190, 70,
                180, 80
        });

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

        arrowSolToE = new Polygon(new double[]{
                170, 430,
                190, 430,
                180, 440
        });

        lineOpToE1 = new Line(300,360,300,400);
        lineOpToE2 = new Line(300,400,180,400);
    }

    public Polygon getArrowBToOp() {
        return arrowBToOp;
    }

    public Polygon getArrowOpToSol() {
        return arrowOpToSol;
    }

    public Polygon getArrowSolToE() {
        return arrowSolToE;
    }

    public Polygon getArrowSolToOp() {
        return arrowSolToOp;
    }

    public Line getLineBToOp() {
        return lineBToOp;
    }

    public Line getLineOpToSol() {
        return lineOpToSol;
    }

    public Line getLineSolToE1() {
        return lineSolToE1;
    }

    public Line getLineSolToE2() {
        return lineSolToE2;
    }

    public Line getLineSolToE3() {
        return lineSolToE3;
    }

    public Line getLineSolToE4() {
        return lineSolToE4;
    }

    public Line getLineSolToOp1() {
        return lineSolToOp1;
    }

    public Line getLineSolToOp2() {
        return lineSolToOp2;
    }

    public Line getLineOpToE1() {
        return lineOpToE1;
    }

    public Line getLineOpToE2() {
        return lineOpToE2;
    }
}