package org.tyaa.demo.java.se.jcf;

import java.util.Random;

public class B {

    private A a;

    public B(A a) {
        this.a = a;
    }

    public void action1() {
        System.out.println("***");
        a.action2(1);
        System.out.println("***");
    }
    public void action2(int n) {
        System.out.println("***");
        a.action2(n * 2);
        System.out.println("***");
    }

    public <T> void action3(T[] arr) {
        System.out.println("*** Array: ***");
        for (T t : arr) {
            System.out.println(t);
        }
        System.out.println("***");
    }
    public void action4(String s) {
        System.out.println("*** URI From Title: ***");
        System.out.println(s);
        System.out.println("***");
    }
}
