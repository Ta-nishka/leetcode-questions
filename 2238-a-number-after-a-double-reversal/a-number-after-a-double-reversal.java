class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev = 0;
        int remainder;
        int original = num;
        int newnum = 0;

        // First reversal
        while(num > 0) {
            remainder = num % 10;
            rev = rev * 10 + remainder;
            num = num / 10;
        }

        // Second reversal
        while(rev > 0) {
            remainder = rev % 10;
            newnum = newnum * 10 + remainder;
            rev = rev / 10;
        }

        return newnum == original;
    }
}
