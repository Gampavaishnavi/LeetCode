class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        backtrack(s, res, new ArrayList<>(), 0);
        return res; 
    }
    public void backtrack(String s, List<List<String>> res, List<String> curr, int idx){
        if(idx == s.length()){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=idx; i<s.length(); i++){
            if(valid(s, idx, i)){
                curr.add(s.substring(idx, i+1));
                backtrack(s, res, curr, i+1);
                curr.remove(curr.size() - 1);
            }
        }
    }
    public boolean valid(String s, int start, int end){
        if(start > end){
            return true;
        }
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}