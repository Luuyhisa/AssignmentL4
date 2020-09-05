package org.example;

import java.util.*;
public class collectionTopic{
    public static void main(String args[]){
        LinkedList<String> al=new LinkedList<String>();
        al.add("luu");
        al.add("ngie");
        al.add("ben");
        al.add("minini");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
