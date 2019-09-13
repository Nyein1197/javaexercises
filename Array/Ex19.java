
/**
 * クラス Ex19 の注釈をここに書きます.
 * 
 * @author (Nyein)
 * @version (2019/6/14)
 */
public class Ex19{
    public static void main(String[]args){
        double[]scores = new double [3];
        double[]grades = {98.2,22.9,30.0};
        for (int i=0;i<=2;i++){
            scores[i] = grades[i];
            System.out.print(scores[i] + " " );
        }
    }
}