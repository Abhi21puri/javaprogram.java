import java.util.*;
public class kadens {
    public static void kadens(int number[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i =0; i<number.length; i++){
            cs = cs + number[i];
            if(cs < 0){
                cs = 0;

            }
            ms = Math.max(cs, ms);

        }
        System.out.println("our maxsubarray sum is : " + ms);

    }

    public static void main(String arg[]){
        int number [] = {-2,-3,4,-1,-2,1,5,-3};
        kadens(number);
    }
    
    
}
