package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import sample.decoration.Decor;
import sample.decoration.Diagram;
import sample.decoration.Idea;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public Diagram diag;
    private Basis basis = new Basis();
    public Pane scheme;

    public void clickIdea(ActionEvent actionEvent) {
        paneClear();
        diag = new Idea(new Diagram() {
            @Override
            public void draw(Pane pane) {

            }
        });
        diag.draw(scheme);

    }

    public void clickDecor(ActionEvent actionEvent) {
        paneClear();
        diag = new Decor(new Diagram() {
            @Override
            public void draw(Pane pane) {

            }
        });
        diag.draw(scheme);
    }

    public void clickClose(ActionEvent actionEvent) {
        Platform.exit();
    }

    public void drawBasis(){
        scheme.getChildren().addAll(basis.getBegin().getFilled(),
            basis.getArrows().getLineBToOp(),
            basis.getArrows().getArrowBToOp(),
            basis.getOperation().getOper1(),
            basis.getArrows().getLineOpToSol(),
            basis.getArrows().getArrowOpToSol(),
            basis.getSolution().getSol(),
            basis.getArrows().getLineSolToE1(),
            basis.getArrows().getLineSolToE2(),
            basis.getArrows().getLineSolToE3(),
            basis.getArrows().getLineSolToE4(),
            basis.getArrows().getArrowSolToE(),
            basis.getArrows().getLineSolToOp1(),
            basis.getArrows().getLineSolToOp2(),
            basis.getArrows().getArrowSolToOp(),
            basis.getOperation().getOper2(),
            basis.getArrows().getLineOpToE1(),
            basis.getArrows().getLineOpToE2(),
            basis.getEnd().getOuter(),
            basis.getEnd().getInner(),
            basis.getEnd().getFilled());
    }

    private void paneClear(){
        scheme.getChildren().clear();
        drawBasis();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        drawBasis();
    }
}
