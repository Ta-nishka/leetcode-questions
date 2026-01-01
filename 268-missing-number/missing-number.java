class Solution {
    public int missingNumber(int[] nums) {
        int max = nums[0];
        int length = nums.length ;
        int sum = 0;
        for(int i = 0 ;i<length ; i ++){
            if(nums[i]>max)
                max = nums[i];
            sum = sum + nums[i];
        }
        int sum2 = (length * ( length + 1 ))/2;
        int missing = sum2 - sum ;
        return missing ; 
    }
}