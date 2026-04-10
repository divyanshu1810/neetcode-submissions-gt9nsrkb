class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet set = new HashSet<Integer>();

        for(int x = 0; x< nums.length; x++){
            set.add(nums[x]);
        }

        return set.size() != nums.length;
    }
}