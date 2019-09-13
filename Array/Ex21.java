
/**
 * クラス Ex21 の注釈をここに書きます.
 * 
 * @author (Nyein)
 * @version (2019/6/14)
 */
import java.util.Arrays;
public class Ex21{
    public static void main(String[]args){
        double[]grades = {98.2,22.9,30.0};
        double[]scores = Arrays.copyOf(grades,2);
        //for (int i=0;i<2;i++){
            System.out.print(Arrays.toString(scores));
        }
    }
