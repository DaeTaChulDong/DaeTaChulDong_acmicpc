package org.example;

import java.util.HashSet;
import java.util.TreeSet;

public class Method {

    String name;
    TreeSet<String> people;

    public Method(){}

    public Method(String name, TreeSet<String> people){
        this.name=name;
        this.people=people;
    }
}
