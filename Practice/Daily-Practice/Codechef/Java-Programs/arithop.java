import java.util.Scanner;

public class arithop {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Sum: "+(a+b));
        System.out.println("Difference: "+(a-b));
        System.out.println("Product: "+(a*b));
        if(a!=0){
            System.out.println("Division: "+(a/b));
        }
        
        System.out.println("Remainder: "+(a%b));
        sc.close();
    }
}