class Solution {
    public int lengthOfLastWord(String s) {
        int p = s.length(); // initialize pointer at end of string
        int length= 0; // initialize word length to 0
        while(p > 0){ // loop through string backwards
            p--;
            if( s.charAt(p) != ' ') {
                length++;
            } else if (length > 0) {
                return length;
            }
        }
        return length;
    }
}