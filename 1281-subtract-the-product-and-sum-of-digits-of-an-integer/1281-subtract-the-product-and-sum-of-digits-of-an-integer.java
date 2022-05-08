class Solution {
    public int subtractProductAndSum(int num) {
        int add_result = 0;
        int mult_result = 1;
        int remainder;
        while (num > 0) {
            remainder = num % 10;
            mult_result *= remainder;
            add_result += remainder;
            num /= 10;
        }
        return mult_result - add_result;
    }
}