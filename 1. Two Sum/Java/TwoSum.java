//hashmap solution, O(n) time
class Solution {
public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>(nums.length);
    for (int i = 0; i < nums.length; i++){
        int potentialMatch = target - nums[i];
        if (map.containsKey(potentialMatch)){
            return new int[] {map.get(potentialMatch), i};
        }
        else {
            map.put(nums[i], i);
			}
		}
    return new int[0];
  }
}