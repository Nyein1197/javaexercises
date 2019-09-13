
/**
 * クラス Ex15 の注釈をここに書きます.
 * 
 * @author (Nyein)
 * @version (2019/6/7)
 */
public class Ex15
{
  public static void main(String[]args){
    int[]numbers = {1,2,3,4,5};
    for(int i=0;i<5;i++){
    System.out.println(" number " + numbers[i] + " is " + numbers[i] );
    } 
    
    for(int i=0;i<5;i++){
        if(i==0){
    System.out.print("{" + numbers[i]);
    }else if(i>0){
      System.out.print("," + numbers[i]);  
    }
    if (i==4){
      System.out.print("}");  
    }
  }
}
}
