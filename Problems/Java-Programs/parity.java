import java.util.Scanner;

public class parity {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(x%2==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }    
}
