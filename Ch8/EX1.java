
/**
 * クラス EX1 の注釈をここに書きます.
 * 
 * @author (Nyein)
 * @version (2019/7/12)
 */
import java.util.Arrays;

public class EX1{
    public static void main(String[]args){
      double[]a = {1,2,3};
      powArray(a,2);
      int[]b ={1,1,1,2,2,3,3,3};
      System.out.print(Arrays.toString(histogram(b)));
    }
    public static double powArray(double[]a,double value){
        for(int i=0;i<a.length;i++){
            double[]aSquare = new double[a.length];
            aSquare[i] = Math.pow(a[i],value);
            System.out.print(aSquare[i]+" ");
        }
        return 1;
    }
    public static int[]histogram(int[]a){
        int[]score = new int[100];
        for(int i=0;i<a.length;i++){
            int index = a[i];
            score [index]++;
        }
        return score;
   }
}
