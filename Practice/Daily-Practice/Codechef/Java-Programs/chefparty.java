import java.util.Scanner;

public class chefparty {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int sum=a*b;
            if(sum<=c){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
