package com.example.physicsenginev_0_1;

import javafx.scene.paint.Color;

public abstract class Body {
    double xPos;
    double yPos;
    double xVel;
    double yVel;
    double xNetForce;
    double yNetForce;
    boolean inMotion;
    double mass;
    double gravity;
    Color color;

    public Body(double xPos, double yPos, double xVel, double yVel, double xNetForce, double yNetForce, boolean inMotion, double mass, double gravity, Color color) {
    }
}
