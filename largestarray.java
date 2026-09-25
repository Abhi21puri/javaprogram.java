import java.util.*;
public class largestarray {
    public static int getlargest(int number[]){
        int largest =  Integer.MIN_VALUE; // - infinity
        int smallest = Integer.MAX_VALUE;
        for(int i= 0; i<number.length; i++){
            if(largest<number[i]){
                largest = number[i];
            }
            if(smallest>number[i]){
                smallest= number[i];
            }
        }
        System.out.println("smallest vlaue is : "+ smallest);
        return largest;
    }
    
    public static void main(String args[]){
        int number[] = {1, 2, 6,3,5};
        System.out.println("largest value is :  " + getlargest(number));
    }


    
}
