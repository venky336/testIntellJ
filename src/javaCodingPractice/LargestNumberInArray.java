package javaCodingPractice;

public class LargestNumberInArray {
    public static void main(String[] args) {
        int arry[] = {10,20,5,6,25};
       // int largest=arry[0];
        int smallest=arry[0];
        for(int i=1;i<arry.length;i++){
           // if(arry[i]>largest)
            if(arry[i]<smallest){
                smallest=arry[i];
            }
        }
        System.out.println("largest element in given array is "+smallest);
    }
}
