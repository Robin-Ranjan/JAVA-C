public class Rohmbus {
    
    public static void main(String[] args) {
        int n =4;
        int number= 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
                
            }
            System.out.println(" ");
        }
        //hollow Rohmbus
        for(int i=1;i<=n;i++){
            //for front space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(i==1||i==n||j==1||j==i){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
                number++;
            }
            System.out.println();
        }
    }
    
}
