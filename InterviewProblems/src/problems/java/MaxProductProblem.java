package problems.java;


/**
 * Created with IntelliJ IDEA.
 * User: Balaji Athreya
 * Date: 9/25/13
 * Time: 7:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class MaxProductProblem {

    public static void main(String[] args){
        int[] arr = {2,3,-23,234,3,2,6,-56,49,-4,48,3};
        int[] numNegatives = new int[arr.length];
        int numOfNegValues = arr[arr.length -1 ] < 0 ? 1 : 0;
        int totalNumOfNegValues = numOfNegValues;
        numNegatives[arr.length - 1] = 0;
        for(int i = arr.length - 2; i >= 0; i--){
            numNegatives[i] = numOfNegValues;
            if(arr[i] < 0){
                numOfNegValues++;
                totalNumOfNegValues++;
            }
        }

        if(totalNumOfNegValues % 2 == 0){
            System.out.println("entire range");
        }
        int start = 0;
        int end = 0;
        int currentStart = 0;
        int currentProd = 1;
        int maxProd = 1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0 && numNegatives[i] % 2 != 1){
                currentStart = i + 1;
                currentProd = 1;
                continue;
            }
            currentProd *= arr[i];
            if(currentProd > maxProd){
                start = currentStart;
                end = i;
                maxProd = currentProd;
            }
        }
        System.out.println("start: "+start+" value: "+arr[start]);
        System.out.println("end: "+end+" value: "+arr[end]);
        System.out.println("prod: "+maxProd);
    }

}

