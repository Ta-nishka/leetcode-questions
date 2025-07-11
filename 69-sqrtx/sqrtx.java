//Ta-nishka
class Solution {
    public int mySqrt(int x) {
        int i =1;
        int count = 0;
        while(x>=i){
            x= x-i;
            i = i+2;
            count++;
        }
        return count;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Solution sol = new Solution(); 
        int sqrt = sol.mySqrt(x);
        
    }
}