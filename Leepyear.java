import java.util.Scanner;

public class Leepyear {
    public static void leepYear(int sy, int ly){
        for(int i=sy;i<=ly;i++){
            if(i%4==0&&(i%100!=0||i%400==0)){
                System.out.println(i+" is a leep year");
                
            }
        }
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Starting year ");
        int sy = sc.nextInt();
        System.out.println("Enter the last year ");
        int ly = sc.nextInt();
        leepYear(sy, ly);
       
    }
}
