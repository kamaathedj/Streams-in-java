package com.kamaathedj;

import com.kamaathedj.models.Actor;

import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
            playMap();
    }

    public static void playMap(){
        Storage m = new Storage();
        m.addActor(1,new Actor(1,"chuck norris",10));
        m.addActor(2,new Actor(1,"Dough laudgren",10));
        m.addActor(3,new Actor(1,"sylvester stallon",10));
        Set s = m.getActorsMap().keySet();
        synchronized (m){
            Iterator i = s.iterator();
            while (i.hasNext())
                someMethod(i.next());
        }
    }

    private static void someMethod(Object next) {
        System.out.println(next);
    }
}
