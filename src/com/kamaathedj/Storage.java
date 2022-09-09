package com.kamaathedj;

import com.kamaathedj.models.Actor;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Storage {

    Map<Integer, Actor> actorsMap  = Collections.synchronizedMap(new HashMap());

    public Map getActorsMap(){
        return this.actorsMap;
    }

    public void addActor(int key , Actor actor){
        this.actorsMap.put(key,actor);
    }

    public Actor getValueByKey(int key){
        return this.actorsMap.get(key);
    }
}
