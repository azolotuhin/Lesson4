package com.company;

import java.util.*;
import java.util.logging.Logger;

/**
 * Created by azolotukhin on 21.09.2016.
 */
public class Lesson4 {
    public void Lesson() throws NullPointerException {
        Collection coll = new ArrayList(); //contains objects
        //Collection<T> coll = new ArrayList<T>(); //collect <T> types
        //coll.add();
        Collection<Integer> coll2 = new ArrayList<Integer>();
        coll2.addAll(Arrays.asList(1, 2, 3, 4));

        Integer[] arr = new Integer[]{1, 2, 3, 4, 5};
        coll2.addAll(Arrays.asList(arr));
        coll2.size();

        Collection<Integer> col3 = new ArrayList<Integer>(Arrays.asList(arr));

        //List
        //ArrayList - high speed access
        //LinkedList - slower, but add/remove faster

        ArrayList<Integer> i = new ArrayList<Integer>();
        i.add(5);
        i.add(3);
        i.add(1);
        System.out.println(i);
        System.out.println(i.get(0));
        i.remove(1);
        System.out.println(i.isEmpty());
        //i.retainAll() //join analog
        i.iterator();
        for(Integer integer : i){}

        Iterator<Integer> iter = i.iterator();
        iter.next();
        iter.hasNext();

        Display(i.iterator());

        ListIterator<Integer> lit = i.listIterator();
        //lit.previous();

        //LinkedList<Integer> llint = new LinkedList<Integer>();
        //llint.getFirst();
        //push - вставить in Stack
        //pop - забрать from Stack
        //peak - вырезать

        Stack stack = new Stack();

        //Set - без дубликатов, но порядок хранения - чёрный ящик
        //HashSet
        //TreeSet
        //LinkedHashSet
        testSet();

        Set<String> strSet = new HashSet<String>();
        strSet.add("Cat");
        strSet.add("Dog");
        strSet.add("Mouse");
        strSet.add("Dog");
        strSet.add("Frog");
        strSet.add("Cat");
        System.out.print(strSet);

        Set<String> treeSet = new TreeSet<String>();
        treeSet.add("Cat");
        treeSet.add("Dog");
        treeSet.add("Mouse");
        treeSet.add("Dog");
        treeSet.add("Frog");
        treeSet.add("Cat");
        System.out.println(treeSet);

        Map<Integer, String> m1 = new HashMap<Integer, String>();
        m1.put(new Integer(5), new String("Floor"));
        m1.put(new Integer(7), new String("Hall"));
        m1.put(new Integer(4), new String("Left"));
        System.out.println(m1);

        Map<String, Integer> m2 = new TreeMap<String, Integer>();
        m2.put("Floor", 1);
        m2.put("Hall", 1);
        m2.put("Lift", 1);
        m2.put("Wall", 1);
        if (m2.containsKey("Floor") ){
        m2.put("Floor", m2.get("Floor")+1);}
        m2.replace("Floor", m2.get("Floor")+1);
        //m2.put("Floor", 2);
        System.out.println(m2);
        System.out.println(m2.get("Floor"));

        Map<Integer, ArrayList<ArrayList<String>>> m22 = new HashMap<Integer, ArrayList<ArrayList<String>>>();

        Set<Integer> set1 = new TreeSet<Integer>();
        set1.add(5);
        set1.add(8);
        set1.add(7);
        System.out.println(set1);

        //Exceptions
        //Error - Java Marchine errors
        //Checked Exceptions - ours
        //Unchecked Exception - runtime exceptions
        Logger logger = Logger.getLogger("MyApplication");
        try{
            TestException();
        }
        catch (Exception e){
            //logger.severe(e.toString());
            System.out.println("Catched");
        }
        finally { //Операция выполняется в любом случае, даже если ошибка
            System.out.println("Finally");
        }


    }
    public static void TestException(){
        Stack t = null;
        if ( t == null) {
            throw new NullPointerException("Test failure");
        }
    }

    public static void Display(Iterator<Integer> it){
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    public static void testSet(){
        Random rn = new Random();
        Set<Integer> intset = new HashSet<Integer>();
        for (int i = 0; i < 1000; i++){
            intset.add(rn.nextInt(30));
        }
        System.out.println(intset);
    }
}
