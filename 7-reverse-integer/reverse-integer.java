import java.util.Scanner;

class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int remainder = x % 10;

            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && remainder > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && remainder < -8)) {
                return 0;
            }
            rev = (rev * 10) + remainder;
            x = x / 10;
        }
        System.out.println(rev);
        return rev;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Solution ob = new Solution();
        int ans = ob.reverse(x);
        System.out.println("Reversed: " + ans);
    }
}
