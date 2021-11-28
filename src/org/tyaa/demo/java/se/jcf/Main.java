package org.tyaa.demo.java.se.jcf;

import org.tyaa.demo.java.se.jcf.models.Person;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

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

        /* Queue<String> strings = new ArrayDeque<>();/
        strings.add("B");
        strings.add("A");
        strings.add("C");
        for (int i = 0; i <= strings.size() + 1; i++) {
            System.out.println(strings.poll());
            // System.out.println(strings.peek());
            // strings.remove();
        } */

        /* Person p1 = new Person("John", 30);
        Person p2 = new Person("Bill", 20);
        Person p3 = new Person("Mary", 10);
        Person p4 = new Person("Jill", 20);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(p4.hashCode());
        System.out.println();
        Set<Person> personSet = new HashSet<>();
        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);
        personSet.add(p4); */
        /* personSet.stream()
            .sorted((person1, person2) -> person2.age - person1.age)
            .forEach(person -> System.out.println(person.hashCode() + " -> " + person)); */
        /* personSet.stream()
            .sorted((person1, person2) -> person1.age - person2.age)
            .collect(Collectors.toSet())
            .forEach(person -> System.out.println(person.hashCode() + " -> " + person)); */
        /* personSet.stream()
            .sorted((person1, person2) -> person2.age - person1.age)
            // .collect(Collectors.toSet())
            .collect(Collectors.toCollection(
                LinkedHashSet::new
            ))
            .forEach(person -> System.out.println(person.hashCode() + " -> " + person)); */
        // personSet.forEach(person -> System.out.println(person.hashCode() + " -> " + person));

        int[] arr = {10, 2, 9, 100, 0, 2, 100, -5, 2};

        Map<Integer, Integer> results = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            results.put(current, results.containsKey(current) ? results.get(current) + 1: 1);
        }
        results.forEach((key, value) -> System.out.printf("%s -> %s\n", key, value));

        // TODO
        // дан массив целых чисел, в котором одно и то же число может встречаться один или более раз,
        // также дано целое число х,
        // нужно собрать в словарь все пары чисел из массива, которые в сумме дают заданное число х,
        // причем если число встречается один раз, то не должны получаться самообъединения,
        // например, задана сумма 8, а два числа - 4 и 4, когда в массиве только один элемент 4,
        // также исключить инверсии, например: один раз встретилось число 3 и один раз - 5,
        // и может получаться две пары - 3 и 5, 5 и 3.
        // Тогда каждое вхождение словаря должно содержать пару чисел - элементов массива,
        // которая дает заданную сумму х.
    }
}
