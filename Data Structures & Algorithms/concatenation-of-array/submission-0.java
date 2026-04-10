class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] results = new int[nums.length * 2];

        for(int i = 0; i < nums.length * 2; i++){
            if (i < nums.length){
                results[i] = nums[i];
            } else {
                results[i] = nums[i - nums.length];
            }
        }

        return results;
    }
}