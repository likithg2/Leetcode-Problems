class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum=target;
        int i,j,found;
        for (i=0;i<nums.length;i++){
            sum=target-nums[i];
            for (j=0;j<nums.length;j++){
                if (i!=j && sum==nums[j]){
                    return new int[] {i,j};
                }
            }
        }
        return new int []{};
    }
}