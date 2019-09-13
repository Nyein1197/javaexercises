
/**
 * クラス Ex28 の注釈をここに書きます.
 * 
 * @author (Nyein)
 * @version (2019/6/21)
 */
public class Ex28{
    public static void main(String[]args){
      String[]studentList = {"Kalam","Jose","Jani","Ahmed"};
      for(int i=0;i<studentList.length;i++){
            if(studentList[i]=="San"){
                System.out.print(" ");
            }else if(studentList[i]!="San"){
                System.out .print("San is not found");   
            }  
      }
    }
}