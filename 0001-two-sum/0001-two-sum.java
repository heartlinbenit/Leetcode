class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int[] arr = new int[2];
        // for(int i=0; i<nums.length; i++)
        // {
        //     int diff = target - nums[i];
        //     for(int j=i+1; j<nums.length; j++)
        //     {
        //         if(diff==nums[j])
        //         {
        //            arr[0] = i;
        //            arr[1] = j;
        //            break; 
        //         }
        //     }
        // }
        // return arr;

        HashMap<Integer, Integer> hsh = new HashMap<Integer, Integer>();

        for(int  i=0; i<nums.length; i++)
        {
            
          int diff = target - nums[i];
          if(hsh.containsKey(diff)){
            return new int[] {hsh.get(diff), i};
          }
          hsh.put(nums[i], i);
        }
        return new int[]{};
    }
}