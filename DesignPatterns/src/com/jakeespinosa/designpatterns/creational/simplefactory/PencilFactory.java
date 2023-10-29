package com.jakeespinosa.designpatterns.creational.simplefactory;

public class PencilFactory {
    public static Pencil makePencil(String type, float leadThickness) {
        return new MechanicalPencil(type, leadThickness);
    }
}
