import java.util.*;
public class LargestNoInArray {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
           
        }
        return largest;
    }

    public static void fibnoccis(int n){
        int sum, sum1 = 0;
        int a = 0, b=1;
        System.out.print(a+" "+b+" ");
        for(int i=0; i<n;i++){
            sum=a+b;
            sum1= sum1+sum;
            System.out.print(sum+" ");
            a=b;
            b=sum;
            // a=temp;
        }
       System.out.println();
       System.out.println(sum1);
       
    }
    public static void main(String args[]){
        int numbers[]= {1,2,3,4,5,6};
        int n = 10;
       fibnoccis(n);
        System.out.println("The largest no is:" + getLargest(numbers) );

    }
}
