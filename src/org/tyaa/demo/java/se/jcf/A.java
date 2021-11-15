package org.tyaa.demo.java.se.jcf;

public class A {
    public void action1(int a, String s, Object o) {
        System.out.println(a + s + o);
    }
    public void action2(int n) {
        for (int i = 0; i < n; i++) {
            action1(5, "123", new int[]{1, 4, 0});
        }

    }
    public <T> void action3(T n, T[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (n instanceof Integer) {
                if ((int)arr[i] < (int)n) {
                    sum += (int)arr[i];
                }
            } else if (n instanceof Double) {
                if ((double)arr[i] < (double)n) {
                    sum += (int)arr[i];
                }
            }
        }
        System.out.println("Sum arr[i] > n = " + sum);
    }
    public void action4(Double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = 0d;
            }
        }
    }
    public String action5(String s) {
        return s.replace(" ", "-").toLowerCase();
    }
}
