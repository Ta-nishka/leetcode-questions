import java.util.Scanner;

class Solution {
    public int divide(int dividend, int divisor) {
        
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long newdividend = Math.abs((long) dividend);
        long newdivisor = Math.abs((long) divisor);
        long count = 0;

        
        while (newdividend >= newdivisor) {
            long temp = newdivisor;
            long multiplier = 1;//number of times multiplied by 2

            
            while (newdividend >= temp * 2) {
                temp = temp * 2;
                multiplier = multiplier * 2;
            }

            newdividend = newdividend - temp;
            count = count + multiplier;
        }

        
        if (((dividend < 0) && (divisor < 0)) || (dividend>0 && divisor >0)) {
            return (int) count;
        } else {
            return (int) -count;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();

        Solution ob = new Solution();
        int ans = ob.divide(dividend, divisor);
        System.out.println("Quotient: " + ans);
    }
}
