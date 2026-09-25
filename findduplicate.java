public class findduplicate { 
      public static  int findduplicate(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i]==nums[j]){
                   return nums[i];
                }
            }
        }
        
        return-1;
    }

    public static void main(String arg[]){
        int nums[] = {3,2,3};
        System.out.println(findduplicate(nums));
        
    }
    
}
