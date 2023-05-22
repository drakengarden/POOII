package com.uam;

public class DatabaseSQLServer implements IDatabase { //liskov principle; wrong usage
    @Override
    public void findAll() {
        createHistory(); //if implementation of interface method calls non interface method, error is avoided
    }

    @Override
    public void save() {
        createHistory();
    }

    public void createHistory() { //own method, separate from interface

    }
}