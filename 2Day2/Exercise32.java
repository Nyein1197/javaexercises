
/**
 * Write a description of class Exercise32 here.
 *
 * @author (Nyein)
 * @version (2019/5/24)
 */
public class Exercise32
{
    public static void main(String args[]){
        for(int i=1; i<=3; i++){
        for(int j=0; j<=3; j++){
            if(i<=j){
            System.out.print("*");
            }else if(i>j){
            System.out.print(" ");
            }
        }
            System.out.println();
        }
    }
}
 
