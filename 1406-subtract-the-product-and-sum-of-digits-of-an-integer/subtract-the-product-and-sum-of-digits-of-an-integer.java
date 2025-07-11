class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0,product=1,remainder;
        while(n>0){
            remainder = n % 10 ;
            sum = sum + remainder;
            product = product*remainder;
            n = n/10;
        }
        int diff= product - sum;
        return diff;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution ob = new Solution();
        int ans = ob.subtractProductAndSum(n);
        System.out.println(ans);
    }
}