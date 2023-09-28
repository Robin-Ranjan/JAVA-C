public class Triangle{



    public static void main(String a[]){
        int n=8;
        Triangle t = new Triangle();
        t.triangle(n);
    }
    public void triangl(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if((i+j)%2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }

            }
        }
    }


    
}