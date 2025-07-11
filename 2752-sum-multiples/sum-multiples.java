class Solution {
    public int sumOfMultiples(int n) {
        int sum =0;
        for ( int i = 1;i<=n;i++){
            if (i%3== 0 || i%5==0 || i%7==0)
            sum =sum + i;
        }
        return sum;        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution ob = new Solution();
        int ans = ob.sumOfMultiples(n);
        System.out.println(ans);
    }
}