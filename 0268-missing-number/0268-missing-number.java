class Solution {
    public int missingNumber(int[] nums) {
        long n = nums.length;
        long sum = n*(n+1)/2;
        long arraySum = 0;
        for(int i=0; i<nums.length; i++) {
            arraySum += nums[i];
        }
        return (int) (sum-arraySum);
    }
}