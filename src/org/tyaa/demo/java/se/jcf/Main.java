package org.tyaa.demo.java.se.jcf;

public class Main {

    public static void main(String[] args) {
	    Facade<Integer> f = new Facade<>();
        // Facade<Character> f = new Facade<>(); // wrong
        // f.randomBAction2().randomAAction3(new Double[]{8d, 0d, 5d}); // wrong
        // f.randomBAction2().randomAAction3(new Integer[]{8, 0, 5}); // correct
        // Double[] arr = {8d, 0d, 5d};
        // f.aAction4(arr).bAction3(arr);

        // String s = "Hello JCF"; // wrong
        // f.aAction5(s).bAction4(s); // wrong

        ValueWrapper<String> sw = new ValueWrapper<>("Hello JCF");
        ValueWrapper<String> sw2 = new ValueWrapper<>("Demo Title 2");
        f.aAction5(sw).bAction4(sw).aAction5(sw2).bAction4(sw2);
    }
}
