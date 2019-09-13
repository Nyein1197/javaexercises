
/**
 * クラス Ex31 の注釈をここに書きます.
 * 
 * @author (Nyein)
 * @version (2019/6/28)
 */
public class Ex31{
    public static void main(String[]args){
        int[]numbers = {1,2,3,4,5};
        int total = 0;
        reduce(numbers,total);
        System.out.print(reduce(numbers,total));
    }
    public static int reduce(int[]a,int total){
        for(int i=0;i<a.length;i++){
            total = total + a[i];
        }
       return total;
    }
}
   