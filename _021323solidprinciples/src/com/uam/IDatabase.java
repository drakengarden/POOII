package com.uam;

public interface IDatabase { // liskov principle: if ab is of type cd, cd can become ab
    void findAll();
    void save();
}