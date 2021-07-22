import java.util.*;
public class ex2 {
    public static void main(String[] args){
        System.out.println("hello");
        Scanner sc =new Scanner(System.in);
        int [] a = new int[5];
        for(int i=0;i<5;i++){
            a[i] = sc.nextInt(); 
        }
        System.out.println(Arrays.toString(a));
    }
    
    
}
