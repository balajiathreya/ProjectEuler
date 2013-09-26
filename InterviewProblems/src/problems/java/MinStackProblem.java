package problems.java;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: Balaji Athreya
 * Date: 9/25/13
 * Time: 7:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class MinStackProblem {

    public static void main(String[] args){
        MyStack stack = new MyStack();
        int[] arr = {2,3,0,-23,234,3,2,6,-56,49,-4,48,3};
        for (int i = 0; i < arr.length; i++){
            stack.push(arr[i]);
            stack.getMin();
        }
    }

    static class MyStack{
        private Stack<Integer> list = new Stack<Integer>();
        private Stack<Integer> minStack = new Stack<Integer>();

        public void push(int n){
            if(minStack.isEmpty() || minStack.peek() >= n){
                minStack.push(n);
            }
            list.push(n);
        }

        public void getMin(){
            System.out.println(minStack.peek());
        }

        public int pop(){
            int n = list.pop();
            if(minStack.peek() == n){
                minStack.pop();
            }
            return n;
        }

    }
}
