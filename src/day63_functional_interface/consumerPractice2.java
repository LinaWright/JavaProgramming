package day63_functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class consumerPractice2 {
    public static void main(String[] args) {
        List<String>names = new ArrayList<>();
        names.addAll(Arrays.asList("Max","Josh","James","Lia","kelly"));
        names.forEach(
                (p) ->{
                    if(p.startsWith("J")){
                        System.out.println(p);
                    }
                }
        );
    }

}
