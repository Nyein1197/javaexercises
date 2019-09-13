
/**
 * クラス Exercise20 の注釈をここに書きます.
 * 
 * @author (Nyein)
 * @version (2019/5/24)
 */
public class Exercise20
{
    public static void main(String[]args){
        for(int i=1; i<=6; i++){
           for(int j=1; j<=6; j++){
              if(i==j){
                   System.out.print(j+"");
              }else{
               System.out.print(" ");   
              }
            }
                  
                  System.out.println("");
        }
    }
}