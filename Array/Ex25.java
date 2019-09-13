
/**
 * クラス Ex25 の注釈をここに書きます.
 * 
 * @author (Nyein)
 * @version (2019/6/21)
 */
import java.util.Arrays;
public class Ex25{
   public static void main(String[]args){
      double[]tempForecast = {26.0,24.5,22.3};
      double[]tempForecastCopy = Arrays.copyOf(tempForecast,3);
      System.out.print(Arrays.toString(tempForecastCopy));
    }
}