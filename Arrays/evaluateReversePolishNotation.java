class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack <>();
        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].equals("*") || tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("/")){
                int a = st.peek();
                st.pop();
                int b = st.peek();
                st.pop();
                int result = 0;
                String operator = tokens[i];
                switch(operator){
                    case"*":
                    result = b*a;
                    break;
                    case"+":
                    result = b+a;
                    break;
                    case"-":
                    result = b-a;
                    break;
                    case"/":
                    result = b/a;  
                    break;                 
                }
                st.push(result);
            }
            else{
                int num = Integer.parseInt(tokens[i]);
                st.push(num);
            }
        }
    return st.peek();
    }
}