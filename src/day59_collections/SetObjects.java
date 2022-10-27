package day59_collections;

import java.util.HashSet;
import java.util.Set;

public class SetObjects {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add(null);
        set.add("hello");
        set.add("$4.5");
        set.add("400");
        set.add("hello");
        set.add("%");
        System.out.println(set);
    }
}
