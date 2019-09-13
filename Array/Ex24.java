
/**
 * クラス Ex24 の注釈をここに書きます.
 * 
 * @author (Nyein)
 * @version (2019/6/21)
 */
public class Ex24{
    public static void main(String[]args){
      double[]tempForecast = {26.0,24.5,22.3};
      double[]tempForecastCopy = new double[tempForecast.length];
      for(int i=0;i<tempForecast.length;i++){
      tempForecastCopy[i] = tempForecast[i];
      System.out.print(tempForecastCopy[i] + " ");
    }
}
}

