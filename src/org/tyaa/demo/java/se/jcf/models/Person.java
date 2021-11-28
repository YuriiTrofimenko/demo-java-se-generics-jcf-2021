package org.tyaa.demo.java.se.jcf.models;

public class Person {

    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int hashCode() {
        return 31 * (this.name.length() + this.age + super.hashCode());
    }

    @Override
    public String toString() {
        return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }
}
