package me.phoenix.example;

import java.util.List;
import java.util.Objects;

public class Object1 implements ObjectInterface{
    private String name; //could be final? but throws error on de-serialisation if it is??
    private int number;
    public Object1(String name, int number) { //would have more parameters
        this.name = name;
        this.number = number;
    }
    @Override
    public void defaultValues(ClassManager classManager) {
        /*sets some default values and does some stuff that should happen on creation,
        im putting it in here as these objects are serialised with json into a redis db
        ,and it doesn't seem to call the constructor when de-serialising them back into objects
         */
    }

    public String getName() {
        return name;
    }
}
