class Solution {
    public String toLowerCase(String s) {
        String ans = s.toLowerCase();
        return ans;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Solution ob = new Solution();
        String st = ob.toLowerCase(s);
        System.out.println(st);

    }
}