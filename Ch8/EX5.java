public class EX5{
    public static int sieve(int n){
        int []a ={2,3,4,5,6,7,8,9,10};
        for(int i = 2;i<a.length;i++){
            for(n=2;n<a.length;n++){
                if(n%a[i]!=0){
                    System.out.println(a[i]+" = prime");
                }
            }
        }
        return 1;
    }
    public static void main(String[]args){
        
        sieve(2);
    }
}