class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for(char ch: s.toCharArray()){
            if(Character.isLetterOrDigit(ch))
                str.append(ch);
        }
        str = new StringBuilder(str.toString().toLowerCase());
        String reversed = str.toString();
        return reversed.equals(str.reverse().toString());
    }
}