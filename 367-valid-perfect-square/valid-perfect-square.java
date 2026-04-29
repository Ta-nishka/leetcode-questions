class Solution {
    public boolean isPerfectSquare(int num) {
        long sum = 0;
        long odd = 1;
        
        while (sum < num) {
            sum += odd;
            odd += 2;  // next odd number
        }
        
        return sum == num;
    }
}
