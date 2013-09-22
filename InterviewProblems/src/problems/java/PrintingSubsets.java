package problems.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Balaji Athreya
 * Date: 9/22/13
 * Time: 12:34 PM
 *
 * Given a set of numbers. Print all possible subsets?
 * http://introcs.cs.princeton.edu/java/23recursion/Combinations.java.html
 *
 */
public class PrintingSubsets {
    public static void comb1(ArrayList list) { comb1("", list); }

    private static void comb1(String prefix, List list) {
        if (list.size() > 0) {
            System.out.println(prefix + "," + list.get(0));
            List subList = list.subList(1,list.size() - 1);
            comb1(prefix + list.get(0), subList);
            comb1(prefix,               subList);
        }
    }

    public static void comb2(List list) { comb2("", list); }
    private static void comb2(String prefix, List list) {
        System.out.println(prefix);
        for (int i = 0; i < list.size(); i++)
            comb2(prefix + list.get(i), list.subList(i + 1,list.size() - 1));
    }


    public static void main(String[] args) {
        ArrayList list = buildList();

        comb1(list);
        System.out.println();

        comb2(list);
        System.out.println();
    }

    public static ArrayList buildList(){
        ArrayList hs = new ArrayList();
        hs.add(0);
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        hs.add(6);
        return hs;
    }
}
