
/**
 * クラス Exercise7 の注釈をここに書きます.
 * 
 * @author (Nyein)
 * @version (2019/5/17)
 */
public class Exercise7
{
   public static void main(String[]args){
        for(int i=0; i<=4; i++){
           for(int j=0; j<=4; j++){
              if(i==j||i==4-j){
                   System.out.print("*");
              }else{
               System.out.print(" ");   
              }
            }
                  
                  System.out.println("");
        }
    }
}
