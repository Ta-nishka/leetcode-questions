import java.util.Scanner;

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 0)
            return false;
        while (n != 1) {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }
}

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution ob = new Solution();
        boolean answer = ob.isPowerOfTwo(n); 
        System.out.println(answer);
    }
}
