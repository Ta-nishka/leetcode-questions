class Solution {
    public int countDigits(int num) {
        int num1 = num;
        int remainder,count = 0;
        
        while(num>0){
            remainder = num%10;
            if(num1%remainder == 0)
                count++;
            num = num/10;
             }
        System.out.println(count);
        return count;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Solution ob = new Solution();
        int ans = ob.countDigits(num);
    }
}