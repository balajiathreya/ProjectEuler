package problems.java;

/**
 * Created with IntelliJ IDEA.
 * User: Balaji Athreya
 * Date: 9/26/13
 * Time: 10:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class NearestPerfectSquare {
    public static void main(String[] args){
        nearestPerfectSquare(13);
        nearestPerfectSquare(12);
    }

    public static void nearestPerfectSquare(int n){
        int sqrt = (int)(Math.sqrt(n) + 0.5);
        System.out.println("sqrt is "+sqrt);
        System.out.println(sqrt*sqrt+"");
    }
}
