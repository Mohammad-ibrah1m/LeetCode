class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1)
                return true;
        for(int i = 0;  i * i >= 0 && i <= num/2; i++){
            
            if(num == (i*i))
                return true;
        }
        return false;
    }
}