package com.example.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareString {

    public static void main(String[] args) {
        String a = "D101";
        String b = "D102";
        String c = "D109";
        String d = "D106";
        System.out.println(a.compareTo(b));
        List list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).compareTo((String)o2);
            }
        });
        for (Object temp : list) {
            System.out.println(temp.toString());
        }
    }
}
