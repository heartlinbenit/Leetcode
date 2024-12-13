class Solution {
    public int searchInsert(int[] nums, int target) {
        int c =0;
        for(int i=0; i<nums.length; i++)
        {
            if(target == nums[i]){
               c = i;
               break;
            }
            else if(nums[i] > target)
            {
                c = i;
                break;
                
            }
            else if(i == (nums.length)-1){
                c = i+1;
                break;
            }
        }
        return c;
    }
}