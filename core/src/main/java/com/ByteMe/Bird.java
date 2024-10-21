package com.ByteMe;

import com.badlogic.gdx.graphics.Texture;
import java.util.ArrayList;

public abstract class Bird {
    public Texture texture;
    public ArrayList<Integer> position;
    public ArrayList<Integer> size;

    public Bird(String t) {
        texture = new Texture(t);
        position = new ArrayList<>(2);
        size = new ArrayList<>(2);
    }
}
