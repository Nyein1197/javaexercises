
/**
 * Write a description of class Exercise31 here.
 *
 * @author (Nyein)
 * @version (2019/5/24)
 */
public class  Exercise31{
    public static void main(String args[]){
      for(int i=1;i<=3;i++){
          for(int j=1;j<=3;j++){
              if(i+j==4||i+j==5||i+j==6){
                System.out.print("*");
            }else if(i+j==2||i+j==3){
            System.out.print(" ");
            }
          }
          System.out.println();
      }
    }
}