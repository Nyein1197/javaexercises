
/**
 * クラス Exercise3 の注釈をここに書きます.
 * 
 * @author (Nyein)
 * @version (2019/4/26)
 */
public class Exercise3{
    public static void main(String[]args){
        for(int i = 1; i <= 3; i++){
            for(int j = 3; j >= i; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
