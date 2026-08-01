class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<words.length;i++){
            if(sb.length() == 0){
                sb.insert(0, words[i]);
            }else{
                sb.insert(0, words[i] + " ");
            }
        }
        return sb.toString();
    }
}