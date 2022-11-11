package me.phoenix.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RedisManager {

    public <T> void updateRedisObject(String key, T object){ //using generic type so should be able to upload either object?
        //sets key value to serialised object in redis
    }

    public <T extends ObjectInterface, K extends ObjectManagerInterface>void getRedisObjects(ClassManager classManager, String key, Class<T> objectClassType, HashMap<String, T> hashMap, K objectManager){
        try{
            //connects to redis

            List<String> objectList = new ArrayList<>(); //would get list of keys from redis
            objectList.add("key1");
            objectList.add("key2");
            objectList.add("key3");
            for (String objectName : objectList){
                T object = null;
                if(objectName.equals("key1")){ //replaced if statment here, would be: client.exists(objectName) meaning if this key exists in the db
                    //object = client.jsonGet(objectName, objectClassType); gets object from db
                    //object.defaultValues(classManager); //constructor isnt called after deserialisation so uses this
                } else { //if key doesn't exist, make new one
                    object = objectManager.emptyObject(objectName);
                    //client.jsonSet(objectName, gson.toJson(object)); update db with new object
                }
                hashMap.put(objectName, object); //adds object to hash in main class
            }

            //client.close();
        } finally {
            //jedis.close();
        }
    }
}
