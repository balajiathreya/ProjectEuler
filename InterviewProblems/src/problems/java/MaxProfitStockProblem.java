package problems.java;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: Balaji Athreya
 * Date: 9/25/13
 * Time: 8:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class MaxProfitStockProblem {

    public static void main(String[] args){
//        int[] arr = {2,3,0,23,234,3,2,6,56,419,4,48,3};
        //int[] arr = {3,234,3,2,6,56,419,2,48,3};
//        int[] arr = {150, 153,139,140,129};
        int[] arr = {-3 ,2 ,1 ,-4 ,5 ,2 ,-1 ,3 ,-1};
        int profit = 0;
        int buy = 0;
        Stack buyStack = new Stack();
        buyStack.push(buy);
        int sell = 1;
        for (int i = 1; i < arr.length; i++){
            int np = arr[i] - arr[buy];
            if(np > profit){
                sell = i;
                profit = np;
            }
            else if(arr[i] < arr[buy]){
                buy = i;
                buyStack.push(buy);
            }
        }
        while ((Integer)buyStack.peek() > sell){
            buyStack.pop();
        }
        buy = (Integer)buyStack.peek();
        System.out.println("buy on "+buyStack.peek()+" for "+arr[buy]);
        System.out.println("sell on "+sell+" for "+arr[sell]);
        System.out.println("max profit "+profit);
    }
}
