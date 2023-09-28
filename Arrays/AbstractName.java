import java.util.Arrays;
import java.util.Scanner;

public class AbstractName {
     public static Boolean findAbstraction(String str1, String str2) {
        
        str1 = str1.toLowerCase();
        str2= str2.toLowerCase();

        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();

        Boolean result = Arrays.equals(str1Array, str2Array);
        return result;
    }

    public static void main(String[] args) {
        String str1 ,str2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String");
        str1 = sc.nextLine();
        System.out.println("Enter second String");
        str2 = sc.nextLine();

        if (findAbstraction(str1, str2)) {
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }
}
