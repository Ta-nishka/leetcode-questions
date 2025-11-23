class Solution {
    public boolean isHappy(int n) {
        int newnum = n;
        while (newnum != 1 && newnum != 4) {
            int sum = 0;
            int num = newnum;
            while (num > 0) {
                int remainder = num % 10;
                sum += remainder * remainder;
                num /= 10;
            }
            newnum = sum;
        }
        return newnum == 1;
    }
}
