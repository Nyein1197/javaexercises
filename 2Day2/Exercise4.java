
/**
 * クラス Exercise4 の注釈をここに書きます.
 * 
 * @author (Nyein)
 * @version (2019/4/26)
 */
public class Exercise4{
    public static void main(String[]args){
        for(int i=0; i<=2; i++){
           for(int j=0; j<=2; j++){
              if(i==j){
                   System.out.print("*");
              }else{
               System.out.print(" ");   
              }
            }
                  
                  System.out.println("");
        }
    }
}