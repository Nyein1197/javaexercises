
/**
 * クラス Exercise34 の注釈をここに書きます.
 * 
 * @author (Nyein)
 * @version (2019/5/24)
 */
public class Exercise34
{
    public static void main (String[]args){
        for(int j = 1 ; j <= 5; j++){
               
             for(int i = 1; i <= 9; i++){
                 if(j==1 || i==5 ||i==j|| i+j==10 || ((i+j ==7 || i+j==9)&& j<4) || ((i+j ==5|| i+j ==6|| i+j == 8)&& j<3)){
                          System.out.print("*");
                 } else{
                           System.out.print (" ");
                 }
             }
                 System.out.println("");
        } 
            
   }
}