
/**
 * クラス Ex29 の注釈をここに書きます.
 * 
 * @author (Nyein)
 * @version (2019/6/21)
 */
public class Ex29{
     public static void main(String[]args){
        String[]studentList = {"Kalam","Jose","Jani","Ahmed"};
        String name = "Kalam";
        Search(studentList,name);
        
    }
    public static String Search(String[]a,String name){
        for(int i=0;i<a.length;i++){
            if(a[i] == name){
              System.out.print("found the student:"+a[i]);
            }
        }
        return"";
    }
}    