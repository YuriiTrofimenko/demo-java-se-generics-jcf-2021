package org.tyaa.demo.java.se.jcf;

import java.util.Random;

public class Facade <T extends Number> {

    public Facade<T> randomBAction2() {
        B b = new B(new A());
        b.action2(1 + new Random().nextInt(10)); // 1 - 10
        return this;
    }

    public Facade<T> randomAAction3(T[] arr) {
       A a = new A();
       a.action3(1 + new Random().nextInt(10), arr); // 1 - 10
       return this;
    }

    public Facade<T> aAction4(Double[] arr) {
        A a = new A();
        a.action4(arr);
        return this;
    }

    public Facade<T> bAction3(Double[] arr) {
        B b = new B(new A());
        b.action3(arr);
        return this;
    }

    // wrong

    /* public Facade<T> aAction5(String s) {
        A a = new A();
        a.action5(s);
        return this;
    }

    public Facade<T> bAction4(String s) {
        B b = new B(new A());
        b.action4(s);
        return this;
    } */

    // correct

    public Facade<T> aAction5(ValueWrapper<String> sWrapper) {
        A a = new A();
        sWrapper.value = a.action5(sWrapper.value);
        return this;
    }

    public Facade<T> bAction4(ValueWrapper<String> sWrapper) {
        B b = new B(new A());
        b.action4(sWrapper.value);
        return this;
    }
}
