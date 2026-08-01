class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int left = 0;
        int right = n-1;
        while( left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        int count = 1;
        int prev  = nums[0];
        for(int i = 1;i<n;i++){
            if(prev != nums[i]){
                count++;
                prev = nums[i];
            }
            if(count == 3){
                return nums[i];
            }
        }
        return nums[0];
    }
}