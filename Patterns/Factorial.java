import java.util.*;

public class Factorial {
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        System.out.print("Enter the value of r ");
        int r = s.nextInt();
        System.out.println("The factorial is " +factorial(n));
        System.out.println("The binomial cofficient is "+binomial_coff(n, r));

    }
    public static int factorial(int number){
        int fact=1;
        for(int i=1;i<=number;i++){
            fact*=i;
         }
        return fact;
    }

    public static float binomial_coff(int n,int r){
         int n_fact= factorial(n);
         int r_fact=factorial(r);
         int nmr_fact=factorial(n-r);
         float coff = n_fact/(r_fact*nmr_fact);
         return coff;
    }
}
