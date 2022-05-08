class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> nums = new HashSet<>();
      Set<Integer> intersection = new HashSet<>();
      for(int i : nums1){
        nums.add(i);
      }
      for(int j : nums2){
        if(nums.contains(j)){
          intersection.add(j);
        }
      }
      int index = 0;
      int[] result = new int [intersection.size()];
      for(int i : intersection){
        result[index++] = i;
      }
      return result;
    }
}