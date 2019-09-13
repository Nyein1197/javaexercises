
/**
 * クラス Ex37 の注釈をここに書きます.
 * 
 * @author (Nyein)
 * @version (2019/9/6)
 */
public class Ex37{
    public static void main(String[]args){
      String[]Countries = {"Japan","Canada","Mexico","Bangladesh"};
      printArray(Countries);
    }
    public static void printArray(String[]a){
       for(int i = 0;i<a.length;i++){
          System.out.print(a[i]+" ");
       }
    }
}