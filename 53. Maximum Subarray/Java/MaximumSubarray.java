package maximumSubarray;
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = maxSum;
        
        for (int i = 1; i < nums.length; i++){
            currentSum = currentSum+nums[i];
            if (currentSum < nums[i]){
                currentSum = nums[i];
            }
            
            if (currentSum > maxSum){
                maxSum = currentSum;
            }
        }
        
        return maxSum;
    }
}