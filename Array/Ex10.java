
/**
 * クラス Ex10 の注釈をここに書きます.
 * 
 * @author (Nyein)
 * @version (2019/5/31)
 */
public class Ex10
{
 public static void main(String[]args){
      int[]numbers = {2,4,6,8,10};
        for(int i=0; i<=4; i++){
        System.out.print( numbers[i]+"," );
    }
    System.out.println(" ");
    //increase by 1
    int[]numbers1 = {2,4,6,8,10};
    for(int i=0;i<numbers.length;i++){
    
    System.out.print(numbers[i]+" plus 1 is equal to" );
    
    numbers[i]+=1;
    System.out.println(numbers[i]);
 }
}
}