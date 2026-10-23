import java.util.*;
class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<>();
        result("",0,0,n,list);
        return list;
        
    }
    public void result(String a,int close,int open,int n,List<String> list){
        if(a.length() == 2*n){
            list.add(a);
            return;
        }
        if(open<n){
            result(a + "(",close,open+1,n,list);
        }
        if(close<open){
            result(a + ")",close+1,open,n,list);
        }
    }
}