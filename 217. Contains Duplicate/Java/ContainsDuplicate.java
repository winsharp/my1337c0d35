package containsDuplicate;

class Solution {
    public boolean containsDuplicate(int[] nums) {        
        HashSet<Integer> numSet = new HashSet(nums.length);
            for (int x: nums){
                if (numSet.contains(x)) return true;
                numSet.add(x);
            }
            return false;
    }
}