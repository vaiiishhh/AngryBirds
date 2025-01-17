package com.ByteMe;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import java.io.Serializable;

public abstract class Obstacle implements Serializable {
    private static final long serialVersionUID = 1L;

    protected transient Texture texture;
    protected Vector2 position;
    protected float width, height;
    public int health;
    public boolean isDestroyed = false;
    protected Wood.Orientation woodOrientation;
    protected Stone.Orientation stoneOrientation;

    public Obstacle(String texturePath, Vector2 position, float width, float height, int health) {
        this.texture = new Texture(texturePath);
        this.position = position;
        this.width = width;
        this.height = height;
        this.health = health;
    }

    public void takeDamage(float damage) {
        this.health -= damage;
        if (this.health <= 0) {
            isDestroyed = true;
            if (this instanceof TNT){
                ((TNT) this).hasExploded = true;
                this.isDestroyed = true;
            }
        }
    }

    public void render(SpriteBatch batch) {
        batch.draw(texture, position.x, position.y, width, height);
    }

    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public void dispose() {
        texture.dispose();
    }
}
