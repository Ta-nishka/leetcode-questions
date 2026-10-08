class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        
        int low = 0;
        int high = nums.size() - 1;
        int occ1 = -1;
        int occ2 = -1;

        // Find first occurrence
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                occ1 = mid;
                high = mid - 1;   // search on left
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        // Reset low and high
        low = 0;
        high = nums.size() - 1;

        // Find last occurrence
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                occ2 = mid;
                low = mid + 1;    // search on right
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return {occ1, occ2};
    }
};