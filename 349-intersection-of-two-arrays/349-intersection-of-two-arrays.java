class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersectionSet = new HashSet<>();
        
        for(int i = 0; i < nums1.length; i++){
            set.add(nums1[i]);
        }
        
        for(int i = 0; i < nums2.length; i++){
            if(set.contains(nums2[i]))
                intersectionSet.add(nums2[i]);
        }
        
        int[] result = new int[intersectionSet.size()];
        
        int j = 0;
        
        for(Integer i : intersectionSet){
            result[j++] = i;
        }
        return result;
        
    }
}