class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder filtered = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filtered.append(Character.toLowerCase(c));
            }
        }

        String newString = filtered.toString();
        int length = newString.length();
        boolean palindrome = true;
        for(int i = 0;i<length-1;i++){
            if (newString.charAt(i)==newString.charAt(length-i-1)){
                palindrome = true;
            }
            else {
                palindrome = false;
                break;
            }

        }
        return palindrome;
        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        Solution ob = new Solution();
        boolean ans = ob.isPalindrome(s);
    }
}