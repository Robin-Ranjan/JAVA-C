import java.util.*;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the starting no of range: ");
        int s_no = sc.nextInt();
        System.out.print("Enter the last no of range: ");
        int l_no = sc.nextInt();
        primeInRange(s_no, l_no);

    }

    public static void primeInRange(int a,int b){
        for(int i=a;i<=b;i++){
           // Isprime(i);
            if(Isprime(i)== true){
                System.out.println(i+" is a prime number");
            }
        }
    }

    public static boolean Isprime(int n) {
        boolean isPrime = true;

        for(int i=2;i<=Math.sqrt(n);i++){

            if(n%i==0){
                isPrime= false;
                break;
            }

        }
        return isPrime;
    }
}
