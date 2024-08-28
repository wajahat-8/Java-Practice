package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        // country(key), population(value)
        java.util.HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        // Example operations
        System.out.println("Population of India: " + map.get("India"));
        System.out.println("Does the map contain 'US'? " + map.containsKey("US"));
        System.out.println("Size of the map: " + map.size());
        System.out.println(map);
        map.put("China", 180);
        System.out.println(map);
//        //Search
//        if(map.containsKey("China")) {
//        	System.out.println("yes this key exist in map");
//        	
//        }
//        else {
//        	System.out.println("map did not contain this key");
//        }
//        
//        System.out.println(map.get("China"));
//        System.out.println(map.get("Pakistan"));
        //Iteration in HashMap
//        for(Map.Entry<String, Integer>e : map.entrySet()) {
//        	System.out.println(e.getKey());
//        	System.out.println(e.getValue());
//        	
//        }
//        Set<String> keys=map.keySet();
//        for(String key:keys) {
//        	System.out.println(key  + " " +map.get(key));
//        }
        
//Rmove value
        map.remove("China");
        System.out.println(map);
    }
}

