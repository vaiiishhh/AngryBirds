package com.ByteMe;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

import java.util.ArrayList;

public abstract class Bird {
    public Texture texture;
    public ArrayList<Integer> size;
    public Vector2 position;
    Vector2 velocity;
    boolean isFlying;
    public ArrayList<Vector2> trajectoryPoints;
    public int damage;

    public Bird(String t) {
        texture = new Texture(t);
        size = new ArrayList<>(2);
        this.position = new Vector2();
        this.velocity = new Vector2(0, 0);
        this.isFlying = false;
        this.trajectoryPoints = new ArrayList<>();
        this.damage = damage;
    }

    public void setPosition(int screenX, int screenY) {
        position.set(screenX, screenY);
    }

}
