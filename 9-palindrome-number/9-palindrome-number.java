class Solution {
    public boolean isPalindrome(int num) {
        int result = 0;
        int originalNum = num;
        int remainder;
        if(num < 0){
        return false;
        }
        if(num >= 0 && num <10){
            return true;
        }
        while(num >0){
            remainder = num % 10;
            result = result * 10 + remainder;
            num = num / 10;
        }
            return originalNum == result;
      
    }
}