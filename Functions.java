import java.util.*;
public class Functions{

    // public static int calculateProduct(int a, int b){
    //     return a*b;

    // }


    public static void printFactorial(int n){

        if(n < 0){
            System.out.println("Invaild Number");
            return;

        }
        int factorial =1;
        for (int i= n ; i>=1; i--){
            factorial = factorial * i;

        }

        System.out.println(factorial);
        return ;

    }

    public static void main(String argsp[])
{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    printFactorial(n);
}}
