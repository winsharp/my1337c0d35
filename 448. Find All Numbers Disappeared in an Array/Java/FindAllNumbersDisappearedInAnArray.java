package findAllNumbersDisappearedInAnArray;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
      int len = nums.length;
        
        //create list of nums to n
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= len; i++)
            list.add(i);

        
        //using index as marker, mark 0 if nums[i] occurs in list.
        for (int i = 0; i < len; i++) {
            list.set(nums[i], 0);
        }
      
        //remove any number flagged with removeIf predicate
        list.removeIf(val -> val == 0);

        return list;
    }
}