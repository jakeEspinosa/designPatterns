package com.jakeespinosa.designpatterns;

import com.jakeespinosa.designpatterns.creational.simplefactory.Pencil;
import com.jakeespinosa.designpatterns.creational.simplefactory.PencilFactory;

public class App {
    public static void main(String[] args) {
        Pencil mechanicalPencil = PencilFactory.makePencil("mechanical", 0.9f);
        System.out.println(mechanicalPencil.getLeadThickness());
        System.out.println(mechanicalPencil.getType());
        mechanicalPencil.draw();
    }
}
