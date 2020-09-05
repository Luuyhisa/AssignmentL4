package org.example;

import java.util.ArrayList;

public class ListTopic {

    public static void main(String[] args){

        ArrayList<Integer> li = new ArrayList<Integer>();
        li.add(1);
        li.add(2);

        for (Integer temp : li) {
            System.out.println(temp);
        }
        System.out.println("==================");

        ArrayList<String> l = new ArrayList<String>();
        l.add("i am me");
        l.add("his him");

        for (String temp : l){
            System.out.println(temp);

        }
        System.out.println("=================");
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(1);
        al.add(2);

        System.out.println(0);


    }
}
