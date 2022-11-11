package me.phoenix.example;

public class Object2Manager implements ObjectManagerInterface{
    private final ClassManager classManager;

    public Object2Manager(ClassManager classManager) {
        this.classManager = classManager;
    }
    @Override
    public Object2 emptyObject(String name){ //unchecked overriding warning here <----
        return new Object2(name, true); //doesnt need to call default values but could do
    }
}
