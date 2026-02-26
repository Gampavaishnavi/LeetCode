class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, target, res, new ArrayList<>(), 0);
        return res;
    }
    public void backtrack(int[] nums, int target, List<List<Integer>> res, List<Integer> curr, int start){
        if(target == 0){
            res.add(new ArrayList(curr));
            return;
        }
        else if(target > 0){
            for(int i=start;i<nums.length;i++){
                if(target >= nums[i]){
                    curr.add(nums[i]);
                    backtrack(nums, target - nums[i], res, curr, i);
                    curr.remove(curr.size() - 1);
                }
            }
        }
    }
}