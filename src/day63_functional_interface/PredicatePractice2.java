package day63_functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePractice2 {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,5,3,4,5,1,4,5,35,2,5,4,6));
        Predicate<Integer> isEven = p-> p%2==0;
        list.removeIf(isEven);
        System.out.println(list);
    }
}
