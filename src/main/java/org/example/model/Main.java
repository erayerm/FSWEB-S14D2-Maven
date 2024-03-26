package org.example.model;

import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("left");
        Wall wall2 = new Wall("double left");
        Wall wall3 = new Wall("triple left");
        Wall wall4 = new Wall("quadruple left");
        Ceiling ceiling = new Ceiling(3, PaintColor.PINK);
        Bed bed = new Bed("Lightning McQueen Like", 2, 1, 1, 0);
        Lamp lamp = new Lamp(LampType.THE_SILENCE_OF_THE_LAMP, true, 1991);
        Wardrobe wardrobe = new Wardrobe(1, 2, 23);
        Carpet carpet = new Carpet(2, 4, PaintColor.PINKER);
        Bedroom bedroom = new Bedroom("name", wall1, wall2, wall3, wall4, ceiling, bed, lamp, wardrobe, carpet);
        System.out.println(bedroom);
    }
}
