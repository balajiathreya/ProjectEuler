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
        int[] arr = {-2,3,-23,234,3,2,6,-56,49,-4,48,3};
        for(int in : arr){
            System.out.print(in + " ");
        }
        System.out.println();
        anothersol(arr);
    }

    public static void anothersol(int[] arr){
        int numOfNegs = 0;
        int firstNeg = -1;
        int lastNeg = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                numOfNegs++;
                lastNeg = i;
                if(firstNeg == -1) firstNeg = i;
            }
        }
        if(numOfNegs % 2 == 0){
            System.out.println("entire range");
            return;
        }
        System.out.println("first neg: "+firstNeg);
        System.out.println("last neg: "+lastNeg);
        System.out.println(Math.max(productRange(arr,firstNeg+1,arr.length - 1),productRange(arr,0,lastNeg - 1)));
    }

    public static long productRange(int[] arr, int start, int end){
        long prod = 1;
        System.out.print("product of the range: ");
        for(int i = start;i <= end; i++){
            System.out.print(arr[i]+" ");
            prod *= arr[i];
        }
        System.out.println("  is "+prod);
        return prod;

    }

    public static void onesol(int[] arr){
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

