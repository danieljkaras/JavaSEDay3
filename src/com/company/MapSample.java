package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.HashMap;
import java.util.Map;

public class MapSample {

    Map<String, Integer> mapa = new HashMap<String, Integer>();

    String myKey;
    int myValue;

    MapSample(String myKey, int myValue) {
        this.myKey = myKey;
        this.myValue = myValue;

    }

    public Map<String, Integer> addToMap(String x, int y) {

        MapSample firstObject = new MapSample("Mateusz", 5);
        MapSample secondObject = new MapSample("Dominik", 5);
        MapSample thirdObject = new MapSample("Daniel", 7);
        MapSample fourthObject = new MapSample("Ania", 12);

        mapa.put(firstObject.myKey, firstObject.myValue);
        mapa.put(secondObject.myKey, secondObject.myValue);
        mapa.put(thirdObject.myKey, thirdObject.myValue);
        mapa.put(fourthObject.myKey, fourthObject.myValue);


       /* for (String obj : mapa.keySet()) {

            System.out.println(obj);
            System.out.println(mapa.values());
            System.out.println(mapa.get("Dominik"));
        } */

        System.out.println(mapa);


        return mapa;
    }

}
