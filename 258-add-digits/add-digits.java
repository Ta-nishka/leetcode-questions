class Solution {
    public int addDigits(int num) {
        int remainder;
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                remainder = num % 10;
                sum = sum + remainder;
                num = num / 10;
            }
            num = sum;
        }
        return num;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Solution ob = new Solution();
        int ans = ob.addDigits(num);
        System.out.println(ans);
    }
}