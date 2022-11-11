package me.phoenix.example;

import java.util.HashMap;

public class Main {
    private ClassManager classManager;
    private final HashMap<String, Object1> object1HashMap = new HashMap<>();
    private final HashMap<String, Object2> object2HashMap = new HashMap<>();

    public void onEnable(){
        this.classManager = new ClassManager();
        classManager.getRedisManager().getRedisObjects(classManager, "Object2", Object2.class, object2HashMap, classManager.getObject2Manager());
        classManager.getRedisManager().getRedisObjects(classManager, "Object1", Object1.class, object1HashMap, classManager.getObject1Manager());
    }


}
