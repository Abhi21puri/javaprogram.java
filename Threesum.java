import java.util.*;

public class Threesum {
   public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> ans = new ArrayList<>();
       int n = nums.length;
       Arrays.sort(nums); // Step 1: Sort the array
       Set<List<Integer>> set = new HashSet<>(); // Step 2: Use a Set to store unique triplets

       // Step 3: Loop through each number
       for (int i = 0; i < n - 2; i++) {
           int low = i + 1;
           int high = n - 1;
           int target = -nums[i]; // Step 4: Target two-sum = -nums[i]


           // Step 5: Two-pointer search
           while (low < high) {
               int sum = nums[low] + nums[high];
               if (sum == target) {
                   // Found a triplet
                   set.add(Arrays.asList(nums[i], nums[low], nums[high]));
                   low++;
                   high--;
               } else if (sum < target) {
                   low++; // Need a bigger sum
               } else {
                   high--; // Need a smaller sum
               }
           }
       }


       // Step 6: Convert set to list
       ans.addAll(set);
       return ans;
   }


   public static void main(String[] args) {
    Threesum sol = new Threesum(); 
     int[] nums = {-1, 0, 1, 2, -1, -4};
      List<List<Integer>> res = sol.threeSum(nums);


       for (List<Integer> triplet : res) {
           System.out.println(triplet);
       }
   }
}


        // int[] nums = {-1, 0, 1, 2, -1, -4};
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         for (int k = j + 1; k < nums.length; k++) {
        //             if (nums[i] + nums[j] + nums[k] == 0) {
        //                 System.out.println(nums[i] + ", " + nums[j] + ", " + nums[k]);
        //                 return;
        //             }
        //         }
        //     }
        // }
        // System.out.println("No triplet found");
    

