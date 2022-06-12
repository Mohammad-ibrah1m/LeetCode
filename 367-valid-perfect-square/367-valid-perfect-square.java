class Solution {
    public boolean isPerfectSquare(int num) {
        for(int i = 0;  i * i >= 0 && i<= num; i++){
            if(num == (i*i))
                return true;
        }
        return false;
    }
}