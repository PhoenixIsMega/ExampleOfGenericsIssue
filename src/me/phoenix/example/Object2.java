package me.phoenix.example;

import java.util.List;
import java.util.Objects;

public class Object2 implements ObjectInterface{
    private String name; //could be final? but throws error on de-serialisation if it is??
    private boolean somethingdifferent;
    public Object2(String name, boolean somethingdifferent) { //would have more parameters
        this.name = name;
        this.somethingdifferent = somethingdifferent;
    }
    @Override
    public void defaultValues(ClassManager classManager) {
        //in this one default values doesnt actually do anything
    }

    public String getName() {
        return name;
    }

    public boolean isSomethingdifferent() {
        return somethingdifferent;
    }

    public void setSomethingdifferent(boolean somethingdifferent) {
        this.somethingdifferent = somethingdifferent;
    }
}
