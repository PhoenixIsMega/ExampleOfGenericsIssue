package me.phoenix.example;

public class ClassManager {
    private final Object1Manager object1Manager;
    private final Object2Manager object2Manager;
    private final RedisManager redisManager;
    public ClassManager() {
        this.object1Manager = new Object1Manager(this);
        this.object2Manager = new Object2Manager(this);
        this.redisManager = new RedisManager();
    }

    public Object1Manager getObject1Manager() {
        return object1Manager;
    }

    public Object2Manager getObject2Manager() {
        return object2Manager;
    }

    public RedisManager getRedisManager() {
        return redisManager;
    }
}
