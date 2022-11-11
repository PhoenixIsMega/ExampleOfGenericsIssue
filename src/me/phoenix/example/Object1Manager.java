package me.phoenix.example;

public class Object1Manager implements ObjectManagerInterface{
    private final ClassManager classManager;

    public Object1Manager(ClassManager classManager) {
        this.classManager = classManager;
    }

    @Override
    public Object1 emptyObject(String teamName){ //unchecked overriding warning here <----
        //called when a new object is needed but the values arent known/ given yet
        Object1 object1 = new Object1(teamName, 5);
        object1.defaultValues(classManager);
        return object1;
    }
}
