public class ArraysCC {
    
    public static int linear(int numbers[],int key){

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[]={1,2,3,4,5,6,7,8,9,10};
        int key=10;
        int index = linear(number,key);
        if(index==-1){
            System.out.print("Not found");
        }else{
        System.out.println("The indes of "+key+" is "+linear(number, key));
    }

}
}
