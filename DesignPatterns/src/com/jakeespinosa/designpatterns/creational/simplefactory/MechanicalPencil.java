package com.jakeespinosa.designpatterns.creational.simplefactory;

public class MechanicalPencil implements Pencil {
    private String type;
    private float leadThickness;

    public MechanicalPencil(String type, float leadThickness) {
        this.type = type;
        this.leadThickness = leadThickness;
    }

    public String getType() {
        return this.type;
    }

    public float getLeadThickness() {
        return this.leadThickness;
    }

    public void draw() {
        System.out.println("Draw");
    }

}
