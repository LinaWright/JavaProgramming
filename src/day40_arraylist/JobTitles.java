package day40_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class JobTitles {
    public static void main(String[] args) {
        ArrayList<String>allJobs = new ArrayList<>();
        allJobs.addAll(Arrays.asList("SEDT","Developer","PO","CEO","Dev op","QA","BA","Chef","Doctor","Teacher","Police Officer","PO"));
        System.out.println("Original " + allJobs);

        ArrayList<String>job1 = new ArrayList<>(allJobs);
        job1.removeAll(Arrays.asList("PO","QA","BA")); //There are two "PO" in the list, it'll remove all.
        System.out.println(job1);

        ArrayList<String>job2 = new ArrayList<>(allJobs);
        job2.retainAll(Arrays.asList("SDET","Developer","Dev op","PO"));
        System.out.println(allJobs);

        ArrayList<String>job3 = new ArrayList<>(allJobs);
        System.out.println(job3.containsAll(Arrays.asList("Chef","CEO")));
        System.out.println(job3.containsAll(Arrays.asList("Chef","CEO","Nurse")));


    }
}
