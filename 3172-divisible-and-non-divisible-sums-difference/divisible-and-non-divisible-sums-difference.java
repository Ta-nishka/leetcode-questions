class Solution {
    public int differenceOfSums(int n, int m) {
        int num1=0;
        int num2=0;
        for(int i = 1;i<=n;i++){
            if(i%m!=0)
                num1 = num1 + i;
            else
                num2 = num2 + i;    
        }
        int diff = num1-num2;
        return diff;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Solution ob = new Solution();
        int ans=ob.differenceOfSums(n,m);
    }
}