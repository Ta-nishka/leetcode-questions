import java.util.Scanner;

class Solution {
    public int alternateDigitSum(int n) {
        int remainder, sum = 0;
        int i = 0;
        int num = n; 

        while (num > 0) {
            i++;
            remainder = num % 10;
            if (i % 2 != 0)
                sum = sum + remainder;
            else
                sum = sum - remainder;
            num = num / 10;
        }
        return (i % 2 == 0) ? -sum : sum; 
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution ob = new Solution();
        int ans = ob.alternateDigitSum(n);
        System.out.println(ans);
    }
}
