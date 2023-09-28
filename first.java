import java.util.*;
public class first {
    public static void main(String args[]) {     
      int n = 10;
      double pencil;
      double eraser;
      char ch = 'A';
      int x=2,y=5;
      int exp= (x*y/x);
      int $ =(x*(y/x));
      
      for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
          System.out.print(ch);
          ch++;
        }
        System.out.println(" ");
      }
     // System.out.println($+","+exp);
        //  Scanner obj = new Scanner(System.in);
        //  System.out.println("Enter price of pen");
        // pen = obj.nextDouble();
        // System.out.println("Enter the price of pencil");
        // pencil=obj.nextDouble();
        // System.out.println("Enter the price of eraser");
        // eraser = obj.nextDouble();

        // double gst = (pencil+eraser+pen)*0.18;
        // double bill = (pencil+eraser+pen+gst);
        // System.out.println("The bill is "+bill);
       
    }
}
