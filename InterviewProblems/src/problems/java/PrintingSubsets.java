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
    public static void main(String[] args) {
        ArrayList list = buildList();
       anotherSol(list);
        //oneSol(list);

    }

    public static void anotherSol(ArrayList list){
        int i = 1;
        int limit = (int)Math.pow(2,list.size());
        while (i <= limit){
            for(int j = 0; j < list.size(); j++){
                //System.out.println("j is : "+j+" (1 << j) " + (1 << j));
                int num = (int) Math.pow(2,j);
                if((i & num) > 0)
                System.out.print(list.get(j)+" ");
            }
            i++;
            System.out.println();
        }
        System.out.println("i is "+i);
    }

    public static void oneSol(ArrayList list){
        System.out.println(list.size());
        int allMasks = (1 << list.size());
        System.out.println(Integer.toBinaryString(allMasks));

        for (int i = 1; i < allMasks; i++){
            for (int j = 0; j < list.size(); j++){
                if ((i & (1 << j)) > 0) //The j-th element is used
                    System.out.print(list.get(j) + " ");
            }
            System.out.println();
        }
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
