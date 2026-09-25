public class duplicatenumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 5};
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    System.out.println("Duplicate found: " + nums[i]);
                    return;
                }
            }
        }
        System.out.println("No duplicate found");
    }
}
