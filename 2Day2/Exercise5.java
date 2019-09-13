
/**
 * クラス Exercise5 の注釈をここに書きます.
 * 
 * @author (Nyein)
 * @version (2019/5/17)
 */
public class Exercise5{
    public static void main(String[]args){
        for(int i=1; i<=3; i++){
           for(int j=1; j<=3; j++){
              if(i==4-j){
                   System.out.print("*");
              }else{
               System.out.print(" ");   
              }
            }
                  
                  System.out.println("");
        }
    }
}