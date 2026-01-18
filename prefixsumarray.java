import java.util.*;

public class prefixsumarray {
    
    public static void maxsubarray(int number []){
        int currsum = 0; 
        int maxsum = Integer.MIN_VALUE;
       int prefix[] = new int[number.length];

        prefix [0] = number[0];
        // calculate prefix sum
        for(int i = 1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + number[i];
        }
            for(int i = 0; i<number.length; i++){
            int start = i;
           for(int j=i ; j<number.length; j++){
            int end = j;
          currsum = start == 0 ? prefix[end] : prefix[end]-prefix[start-1];
           if(maxsum<currsum){
            maxsum =currsum;
         }
        }
        }
        System.out.println("maxsum = "+ maxsum);
    }

     public static void Kadanes (int number[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
       
        for(int i = 0; i<number.length; i++){
            cs = cs + number[i];
            if(cs < 0){
            cs = 0;
            }
            ms = Math.max(cs , ms);
        }
        System.out.println("our max subarry sum is : " + ms);
    
     }

    public static void main(String args[]){
        int number[] ={-2,-3,4,-1,-2,1,5,-3};
        Kadanes(number);

        
    }
}
