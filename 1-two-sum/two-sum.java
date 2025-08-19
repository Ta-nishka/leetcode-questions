import java.util.Scanner;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {  
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};  
                }
            }
        }
        return null;  
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();

        int[] nums = new int[n];

        
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        
        int target = sc.nextInt();

        Solution sol = new Solution();
        int[] result = sol.twoSum(nums, target);

        if (result != null) {
            System.out.println("Indices: [" + result[0] + ", " + result + "]");
        } else {
            System.out.println("No solution found.");
        }

        sc.close();
    }
}
