class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] visited = new boolean[26];
        for(char ch : sentence.toCharArray()){
            visited[ch - 'a'] = true;
        }
        for(boolean b : visited){
            if(b == false){
                return false;
            }
        }
        return true;
    }
}