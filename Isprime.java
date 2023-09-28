import java.util.*;

public class Isprime {
    public static void main(String[] args) {

        boolean isPrime = true;
        do{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime=false;
            }
        }

        if(isPrime==true){
            System.out.println(n+" is prime number");
        }else{
            System.out.println(n+" is not prime number");
        }
    }while(true);
    }
}
