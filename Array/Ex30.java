
/**
 * クラス Ex30 の注釈をここに書きます.
 * 
 * @author (Nyein)
 * @version (2019/6/28)
 */
public class Ex30{
     public static void main(String[]args){
        int[]numbers = {1,2,3,4,5};
        int num = 5;
        search(numbers,num);
        
    }
    public static int search(int[]a,int num){
        for(int i=0;i<a.length;i++){
            if(a[i] == num){
              System.out.print("find the value:"+a[i]);
              return 1;
            }
        }
        return -1;
    }
}    