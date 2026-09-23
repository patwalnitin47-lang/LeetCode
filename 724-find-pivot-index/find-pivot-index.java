class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum=0;
        int leftsum=0;
        for(int ele : nums){
            totalsum+=ele;
        }
        for(int i=0;i<nums.length;leftsum+=nums[i++]){
            if(leftsum*2 == totalsum - nums[i]){
                return i;
            }
        }return -1;
    }
}