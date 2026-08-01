class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch != ']'){
                st.push(ch);
            }else{
                StringBuilder sb = new StringBuilder();
                while(!st.isEmpty() && st.peek() != '['){
                    sb.insert(0, st.pop());
                }
                st.pop();
                StringBuilder nsb = new StringBuilder();
                while(!st.isEmpty() && Character.isDigit(st.peek())){
                    nsb.insert(0, st.pop());
                }
                int k = Integer.parseInt(nsb.toString());
                String str = sb.toString().repeat(k);
                for(char c : str.toCharArray()){
                    st.push(c);
                }   
            }
        }
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
            res.insert(0, st.pop());
        }
        return res.toString();
    }
}


