import java.util.Scanner;

public class chefdonation {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int sum=b-a;
            System.out.println(sum);
        }
        sc.close();
    }    
}
