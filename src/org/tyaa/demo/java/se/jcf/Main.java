package org.tyaa.demo.java.se.jcf;

import java.awt.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	    // Facade<Integer> f = new Facade<>();
        // Facade<Character> f = new Facade<>(); // wrong
        // f.randomBAction2().randomAAction3(new Double[]{8d, 0d, 5d}); // wrong
        // f.randomBAction2().randomAAction3(new Integer[]{8, 0, 5}); // correct
        // Double[] arr = {8d, 0d, 5d};
        // f.aAction4(arr).bAction3(arr);

        // String s = "Hello JCF"; // wrong
        // f.aAction5(s).bAction4(s); // wrong

        // ValueWrapper<String> sw = new ValueWrapper<>("Hello JCF");
        // ValueWrapper<String> sw2 = new ValueWrapper<>("Demo Title 2");
        // f.aAction5(sw).bAction4(sw).aAction5(sw2).bAction4(sw2);

        /* ArrayList objects = new ArrayList();
        objects.add(123);
        objects.add("123");
        for (var object : objects) {
            if (object instanceof String) {
                System.out.println("Hello " + object);
            } if (object instanceof Integer) {
                System.out.println("x^2 = " + (int)object * (int)object);
            }
        } */

        /* List<Integer> integers = new ArrayList<>();
        integers.add(123);
        // integers.add("123");
        for (Integer integer : integers) {
            System.out.println(integer * integer);
        } */

        Queue<String> strings = new ArrayDeque<>();
        strings.add("B");
        strings.add("A");
        strings.add("C");
        for (int i = 0; i <= strings.size() + 1; i++) {
            System.out.println(strings.poll());
            // System.out.println(strings.peek());
            // strings.remove();
        }
    }
}
