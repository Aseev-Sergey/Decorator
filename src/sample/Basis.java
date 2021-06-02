package sample;

import sample.Nodes.*;

public class Basis {

    private Arrows arrows;
    private Begin begin;
    private End end;
    private Operation operation;
    private Solution solution;

    public Basis(){
        arrows = new Arrows();
        begin = new Begin();
        end = new End();
        operation = new Operation();
        solution = new Solution();
    }

    public Arrows getArrows() {
        return arrows;
    }

    public Begin getBegin() {
        return begin;
    }

    public End getEnd() {
        return end;
    }

    public Operation getOperation() {
        return operation;
    }

    public Solution getSolution() {
        return solution;
    }
}
