class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap <Integer,Integer> map = new HashMap <>();
        for(int i =1;i<10;i++){
            map.put(i,0);
        }
        int[][] nums = new int[board.length][board[0].length];
        for(int i =0; i < 9;i++){
            for(int j = 0; j<9;j++){
                if(board[i][j] == '.'){
                    nums[i][j] = 0;
                }
                else{
                nums[i][j] = board[i][j] - '0';
                }
            }
        }
        for(int i =0;i<9;i++){
            for(int j =0;j<9;j++){
                if(map.containsKey(nums[i][j])){
                    map.put(nums[i][j],map.get(nums[i][j])+1);
                }
                else{
                    continue;
                }
                if(map.get(nums[i][j])>1){
                    return false;
                }
            }
            map.replaceAll((key,value) -> 0);
        }
        for(int i =0;i<9;i++){
            for(int j =0;j<9;j++){
                if(map.containsKey(nums[j][i])){
                    map.put(nums[j][i],map.get(nums[j][i])+1);
                }
                else{
                    continue;
                }
                if(map.get(nums[j][i])>1){
                    return false;
                }
            }
            map.replaceAll((key,value) -> 0);
        }
        for(int r = 0;r<9;r=r+3){
            for(int c = 0;c<9;c=c+3){
                for(int i = r;i<r+3;i++ ){
                    for(int j = c;j<c+3;j++){
                        if(map.containsKey(nums[i][j])){
                            map.put(nums[i][j],map.get(nums[i][j])+1);
                        }
                        else{
                            continue;
                        }
                        if(map.get(nums[i][j]) > 1){
                            return false;
                        }
                    } 
                }
                map.replaceAll((key,value) -> 0);
            }
        }
    return true;
    }
}