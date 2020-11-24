package com.sunshine.webproject.util;

import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

/**
 * @author sunshine
 * @date 2020/11/17 18:02
 */
public class MapTest {
    public static final String key = "k";
    public static final String anotherKey = "anotherKey";
    public static final String value = "v";
    public static final String anotherValue = "anotherValue";
    public static void test(Supplier<Map<String,String>> supplier){
        Map<String,String> map = supplier.get();
        if (Objects.isNull(map))
            return;
        print(map.getClass().getSimpleName());
        print("without put");
        testGet(map,null);
        print("put null key and not null value");
        testPut(map,null,value);
        testGet(map,null);
        print("put not null key and  null value");
        testPut(map,key,null);
        testGet(map,key);
        print("put not null key and not null value");
        testPut(map,key,value);
        testGet(map,key);
        print("put null key and null value");
        testPut(map,null,null);
        testGet(map,null);
    }

    public static void testGet(Map<String,String> map,String key){
        String v = null;
        try {
             v = map.get(key);
            System.out.println("allow get("+(key==null?"null":key)+") and return value is " + (v==null?"null":v)+"."
            +"  containsKey("+(key==null?"null":key)+")?"+map.containsKey(key));
        }catch (NullPointerException e){
            System.out.println("refuse get("+(key==null?"null":key)+")");
        }
    }

    public static void testPut(Map<String,String> map,String key,String value){
        map.clear();
        try {
            map.put(key,value);
            System.out.println("allow put("+(key==null?"null":key)+","+(value==null?"null":value)+")");
        }catch (NullPointerException e){
            System.out.println("refuse put("+(key==null?"null":key)+","+(value==null?"null":value)+")");
        }
    }

    public static void print(String s){
        System.out.println();
        System.out.println("--------"+s+"----------");
    }

    public static void main(String[] args) {
        test(HashMap::new);
        test(LinkedHashMap::new);
        test(TreeMap::new);
        test(ConcurrentHashMap::new);
    }
}
