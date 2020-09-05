package org.example;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class hashTopic {

    public static void main(String[] args) {
        HashMap<Integer, String> m=new HashMap<Integer,String>();

        m.put(1, "uno");
        m.put(2, "quadro");
        m.put(3, "doss");

        System.out.println(m);

        TreeMap<String, String> tm =new TreeMap<String, String>();

        tm.put("R", "red");
        tm.put("b", "blue");
        System.out.println(tm);

        Hashtable<Integer, String> ht =new Hashtable<Integer, String>();

        ht.put(1, "wani");
        ht.put(2, "thu");
        System.out.println(ht);

    }
}
