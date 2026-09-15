class Solution {
    public int maxSubArray(int[] nums) {
        int current =-100000;
        int best=-100000;
        for (int i =0;i<nums.length;i++){
            current=Math.max(current+nums[i],nums[i]);
            best=Math.max(best,current);
        }
        return best;
    }
}