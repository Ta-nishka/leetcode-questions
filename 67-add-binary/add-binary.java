class Solution {
    public String addBinary(String a, String b) {
        int length1 = a.length();
        int length2 = b.length();
        int length = Math.max(length1, length2);

        // result array (extra space for carry)
        char[] ans = new char[length + 1];
        int carry = 0;

        int i = length1 - 1;
        int j = length2 - 1;
        int k = length; // index for ans

        while (i >= 0 || j >= 0) {
            int rem1 = (i >= 0) ? a.charAt(i) - '0' : 0;
            int rem2 = (j >= 0) ? b.charAt(j) - '0' : 0;

            int sum = rem1 + rem2 + carry;
            ans[k] = (char) ((sum % 2) + '0'); // store bit
            carry = sum / 2;                   // update carry

            i--; j--; k--;
        }

        // handle final carry
        if (carry > 0) {
            ans[k] = '1';
            return new String(ans);
        } else {
            return new String(ans, 1, length); // skip leading empty slot
        }
    }
}
