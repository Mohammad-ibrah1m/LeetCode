class Solution {
    public boolean isPalindrome(int x) {
        int reversed = 0;
        int remainder;
        int original = x;
        if(x < 0){
            return false;
        }
        if(x >= 0 && x < 10){
            return true;
        }
        while( x > 0){
            remainder = x%10;
            reversed = reversed*10 + remainder;
            x= x/10;
        }
        return original == reversed;
      
    }
}