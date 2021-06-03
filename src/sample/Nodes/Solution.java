package sample.Nodes;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Solution {

    private Rectangle sol;

    public Solution(){
        sol = new Rectangle(100, 100, Color.WHITE);
        sol.setX(130);
        sol.setY(200);
        sol.setRotate(45);
    }

    public Rectangle getSol() {
        return sol;
    }
}
