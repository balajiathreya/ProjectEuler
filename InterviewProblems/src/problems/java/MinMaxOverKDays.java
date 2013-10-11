package problems.java;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: Balaji Athreya
 * Date: 9/26/13
 * Time: 12:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class MinMaxOverKDays {

    public static void main(String[] args){
       // MyStack stack = MyStack.buildStack();

    }


    static class MinMaxList{
        private ArrayList<Integer> list = new ArrayList<Integer>();
//        private ArrayList<Integer> minList = new ArrayList<Integer>();
//        private ArrayList<Integer> maxList = new ArrayList<Integer>();
        private int currentMin = -1;
        private int currentMax = -1;
        private int k = 3;

        public void add(int n){
            int currentPointer = list.size() - 1;
            int lastIndex = currentPointer - k;
            if(currentMin == lastIndex || currentMax == lastIndex){

            }
            list.add(n);

        }

    }
}
