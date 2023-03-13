class Solution {
    public int lengthOfLastWord(String s) {
        int p = s.length(); // initialize pointer at end of string
        int length= 0; // initialize word length to 0
        while(p > 0){ // loop through string backwards
            p--;
            if( s.charAt(p) != ' ') { // if the character is not a space
                length++; // increment word length
            } else if (length > 0) { // if we've encountered a space and have already counted some word characters
                return length;
            }
        }
        return length;
    }
}