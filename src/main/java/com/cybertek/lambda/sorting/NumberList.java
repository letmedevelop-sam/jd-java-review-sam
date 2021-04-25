package com.cybertek.lambda.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NumberList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(15);
        list.add(3);
        list.add(500);
        list.add(25);

        System.out.println("NOT sorted : " + list);

        Collections.sort(list);

        System.out.println("Sorted Ascending : " + list);

        Collections.sort(list, new MyComparator());
        System.out.println("Sorted Descending: " + list);

        //************************

        System.out.println("//****** With Lambda *******//");

        Collections.sort(list);
        System.out.println("Ascending Order : " + list);

        Collections.sort(list, ((o1, o2) -> (o1>o2)?-1 : (o2>o1)?1 : 0));
        System.out.println("Descending Order: " + list);

        list.sort((o1,o2) -> o1.compareTo(o2));
        System.out.println("Ascending Order without Collections : " + list);

        list.sort((o1,o2) -> o2.compareTo(o1));
        System.out.println("Descending Order without Collections : " + list);


    }
}
