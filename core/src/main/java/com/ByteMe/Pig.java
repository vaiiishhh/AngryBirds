package com.ByteMe;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import org.junit.jupiter.api.Test;

import java.io.Serializable;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public abstract class Pig implements Serializable {
    private static final long serialVersionUID = 1L;
    public transient Texture texture;
    public Vector2 position;
    public ArrayList<Integer> size;
    public int health;
    public boolean isDestroyed = false;

    public Pig(String t, int health) {
        this.health = health;
        texture = new Texture(t);
        this.position = new Vector2();
        size = new ArrayList<>(2);
    }

    public void takeDamage(float damage) {
        health -= damage;
        if (health <= 0) {
            isDestroyed = true;
        }
    }
    public void setPosition(int screenX, int screenY) {
        position.set(screenX, screenY);
    }
}
