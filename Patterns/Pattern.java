public class Pattern{
    public static void main(String[] args) {
        int a=4;
        int b=5;
       // Solid Rectangle
       
        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // //Hollow Rectangle
        // for(int i=1;i<=a;i++){
        //     for(int j=1;j<=b;j++){
        //         if (i==1||j==1||i==a||j==b) {
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println(); 
        // }

        // for(int i=a;i>0;i--){
        //     for(int j=i;j>0;j--){
        //         System.out.print("*");
        //      }System.out.println(" ");
        // }
    }
}
