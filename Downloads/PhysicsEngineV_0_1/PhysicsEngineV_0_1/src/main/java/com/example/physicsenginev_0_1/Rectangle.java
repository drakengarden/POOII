package com.example.physicsenginev_0_1;

import javafx.scene.paint.Color;

public class Rectangle extends Body {
    double width;
    double height;

    public Rectangle(double xPos, double yPos, double xVel, double yVel, double xNetForce, double yNetForce, boolean inMotion, double mass, double gravity, Color color, double width, double height) {
        super(xPos, yPos, xVel, yVel, xNetForce, yNetForce, inMotion, mass, gravity, color);
        this.xPos = xPos;
        this.yPos = yPos;
        this.xVel = xVel;
        this.yVel = yVel;
        this.xNetForce = xNetForce;
        this.yNetForce = yNetForce;
        this.inMotion = inMotion;
        this.mass = mass;
        this.gravity = gravity;
        this.color = color;
        this.width = width;
        this.height = height;
    }
}
