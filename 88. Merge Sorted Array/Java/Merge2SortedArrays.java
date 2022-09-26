package merge2SortedArrays;

class Solution {
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
      
        for(int i = m; i < nums1.length; i++){
            if (nums1[i] == 0){
                nums1[i] = nums2[j];
                    j++;
            }
        }
        Arrays.sort(nums1);
    }
}

or

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Set p1 and p2 to point to the end of their respective arrays.
        int p1 = m - 1;
        int p2 = n - 1;
        
        // And move p backwards through the array, each time writing
        // the smallest value pointed at by p1 or p2.
        for (int p = nums1.length-1; p >= 0; p--) {
            if (p2 < 0) {
                break;
            }
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1--];
            } else {
                nums1[p] = nums2[p2--];
            }
        }
    }
}