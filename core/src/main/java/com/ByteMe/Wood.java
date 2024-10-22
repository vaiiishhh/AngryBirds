package com.ByteMe;

import com.badlogic.gdx.math.Vector2;

public class Wood extends Obstacle {
    public enum Orientation {
        HORIZONTAL,
        VERTICAL,
        DIAGONAL
    }

    public Wood(Vector2 position, Orientation orientation) {
        super(orientation == Orientation.HORIZONTAL ? "wood_horizontal.png" : (orientation == Orientation.VERTICAL ? "wood_vertical.png" : "wood_diagonal.png"),
            position,
            orientation == Orientation.VERTICAL ? 10 : 50,
            orientation == Orientation.HORIZONTAL ? 10 : 50);
    }
}
