class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> map = new HashMap <>();
        for(int i = 0;i<strs.length;i++){
            String a = strs[i];
            char[] arr = a.toCharArray(); 
            Arrays.sort(arr);
            String b = new String(arr);
            if(map.containsKey(b)){
                map.get(b).add(a);
            }
            else{
                map.put(b,new ArrayList<>());
                map.get(b).add(a);
            }
        }
    return new ArrayList<>(map.values());    
    }
}