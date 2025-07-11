class Solution {
    public boolean isUgly(int n) {
        if (n == 1)
            return true;
        if (n <= 0)
            return false;

        if (n % 2 == 0)
            return isUgly(n / 2);
        if (n % 3 == 0)
            return isUgly(n / 3);
        if (n % 5 == 0)
            return isUgly(n / 5);
        else
            return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    }

}
