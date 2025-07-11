import java.util.Scanner;

class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSums = 0;
        int digitSums = 0;
        int diff;

        for (int i = 0; i < nums.length; i++) {
            elementSums += nums[i]; // sum of array elements
        }

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            while (num > 0) {
                digitSums += num % 10;
                num /= 10;
            }
        }

        diff = Math.abs(elementSums - digitSums);
        return diff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        Solution ob = new Solution();
        int ans = ob.differenceOfSum(nums);
        System.out.println(ans);
    }
}
