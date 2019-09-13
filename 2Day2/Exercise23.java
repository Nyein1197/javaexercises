
/**
 * クラス Exercise23 の注釈をここに書きます.
 * 
 * @author (Nyein)
 * @version (2019/5/24)
 */
public class Exercise23{
      //for loop
      //Start at 1
      public static void main(String[]args ){
          for(int i=1 ; i<=15;i++){
              if(i%3==0 && i<=14){
                   System.out.print(" Fizz ");
              }else if(i%5==0 && i<=14){
                   System.out.print(" Buzz ");
              }else if(i==15){
                   System.out.print(" FizzBuzz ");
              }else{
                   System.out.print(i + " ");
              
              }
          }
      }
}

   