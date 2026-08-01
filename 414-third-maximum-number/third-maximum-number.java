class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
    
        int count = 1;
        int prev  = nums[n-1];
        for(int i = n-2;i>=0;i--){
            if(prev != nums[i]){
                count++;
                prev = nums[i];
            }
            if(count == 3){
                return nums[i];
            }
        }
        return nums[n-1];
    }
}