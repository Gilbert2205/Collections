package com.company;

import java.lang.reflect.Array;
import java.nio.channels.Pipe;
import java.util.*;

public class Main {

    public static void main(String[] args) {
//        TreeSet<String> al = new TreeSet<String>new myComp();
//        al.add("B");
//        al.add("C");
//        al.add("A");
//        al.add("E");
//        al.add("D");
//        al.add("F");
//
//        for (String element: al)
//            System.out.println(element +"" );
//        System.out.println();
//
//        System.out.println("Original contents of al: ");
//        Iterator<String> itr = al.iterator();
//        while(itr.hasNext());{
//            String element = itr.next();
//            System.out.println(element+" ");
//        }
//        System.out.println();
//
//        ListIterator<String> litr = al.listIterator();
//        while (litr.hasNext()){
//            String element = litr.next();
//            litr.set(element+"+");
//        }
//        System.out.println("Modified contents of al: ");
//        itr = al.iterator();
//        while (itr.hasNext()){
//            String element = itr.next();
//            System.out.println(element + "");
//
//        }
//        System.out.println();
//        System.out.println("Modified list backwards: ");
//        while (litr.hasPrevious()){
//            String element = litr.previous();
//            System.out.println(element +"");
//
//        }
//        System.out.println();
        TreeMap<String, Double> hm = new TreeMap<String, Double>();
        hm.put("JohnDoe",3434.34);
        hm.put("TomSmith", new Double(123.34));
        hm.put("JaneBaker", new Double(1434.34));
        hm.put("TodHall", new Double(99.34));
        hm.put("RalphSmith", new Double(-19.34));

        Set <Map.Entry<String, Double>>set = hm.entrySet();
        for (Map.Entry<String, Double>me:set){
            System.out.println(me.getKey()+": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        double balance  = hm.get("JohnDoe");
        hm.put("JohnDoe", balance + 1000);
        System.out.println("John`s new balancce: " +
        hm.get("JohnDoe"));

        List<String>list1  = Arrays.asList("red","green", "blue");
        Collections.reverse(list1);
        System.out.println(list1);
        List<String>list2 = Arrays.asList("green", "red", "yellow", "blue");
        Collections.shuffle(list2);
        System.out.println(list2);

        List<String>list  = Arrays.asList("red","green", "blue");
        Collections.fill(list,"black");
        System.out.println(list);

        Collection<String> collection1 = Arrays.asList("red", "cyan");

        Collection<String> collection2 = Arrays.asList("red", "blue");

        Collection<String> collection3 = Arrays.asList("pink", "tan");

        System.out.println(Collections.disjoint(collection1,collection2));
        System.out.println(Collections.disjoint(collection1,collection3));

        List<Integer> list5 = Arrays.asList(2,4,7,10,11,45,50,59,60,66);
        System.out.println("(1) Index: " + Collections.binarySearch(list5,7));


    }
}
