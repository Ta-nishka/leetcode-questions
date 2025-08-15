import java.util.Scanner;

class Solution {
    public boolean isPowerOfFour(int n) {
        if (n == 0)
            return false;
        while (n != 1) {
            if (n % 4 != 0)
                return false;
            n = n / 4;
        }
        return true;
    }
}

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution ob = new Solution();
        boolean answer = ob.isPowerOfFour(n); 
        System.out.println(answer);
    }
}
