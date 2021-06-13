package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import sample.decoration.Branch;
import sample.decoration.Diagram;
import sample.decoration.Cycle;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public Diagram diag;
    private Basis basis = new Basis();
    public Pane scheme;

    public void clickCycle(ActionEvent actionEvent) {
        diag = new Cycle(new Diagram() {
            @Override
            public void draw(Pane pane) {

            }
        });
        diag.draw(scheme);

    }

    public void clickBranch(ActionEvent actionEvent) {
        diag = new Branch(new Diagram() {
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
            basis.getArrows().getLineOptoE(),
            basis.getArrows().getArrowOpToE(),
            basis.getEnd().getOuter(),
            basis.getEnd().getInner(),
            basis.getEnd().getFilled());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        drawBasis();
    }


    public void clickClear(ActionEvent actionEvent) {
        scheme.getChildren().clear();
        drawBasis();
    }
}
