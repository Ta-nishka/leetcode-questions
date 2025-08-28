import java.util.Scanner;

class Solution {
    public int fib(int n) {
        double a = 1 + Math.sqrt(5);
        double b = 1 - Math.sqrt(5);
        double ans;
        if (n == 0) {
            return 0;
        } else {
            ans = (Math.pow(a, n) - Math.pow(b, n)) / (Math.pow(2, n) * Math.sqrt(5));
        }
        int result = (int)ans; 
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution ob = new Solution();
        int res = ob.fib(n);
        System.out.println(res);
    }
}
