import java.util.Scanner;
public class Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print( "a= ");
        int a = sc.nextInt();
        System.out.println("b= ");
        int b= sc.nextInt();
        test(a,b);
    }

  public static void  test(int a ,int b){
    
    int sum = a + b;
    System.out.println("sum of two numbers is: "+sum);
       
  }
}
