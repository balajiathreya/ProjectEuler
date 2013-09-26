package problems.java;

import utils.java.Utilities;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created with IntelliJ IDEA.
 * User: Balaji Athreya
 * Date: 9/25/13
 * Time: 7:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class Sumof3NosInArray {

    public static void main(String[] args){
        ArrayList<Integer> list = Utilities.buildList();
        Collections.sort(list);
        for(int i = list.size() - 1; i >= 0; i-- ){
            int max = list.get(i);
            int start = 0;
            int end = i - 1;
            while(start < end){
                int n1 = list.get(start);
                int n2 = list.get(end);
                if(n1 + n2 == -max){
                    System.out.println("numbers are : "+n1+" , "+n2+" , "+max);
                    System.exit(0);
                }
                else if(n1 + n2 < -max ){
                    start++;
                }
                else if(n1 + n2 > -max){
                    end--;
                }
            }
        }

    }
}
