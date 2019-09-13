
/**
 * クラス Exercise15 の注釈をここに書きます.
 * 
 * @author (Nyein)
 * @version (2019/5/24)
 */
public class Exercise15
{
     public static void main(String[]args){
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <=4-i; j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}
