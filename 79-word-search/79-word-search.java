class Solution {
    public boolean exist(char[][] board, String word) {
        
        for(int i = 0; i<board.length;i++){
            
            for(int j =0;j<board[0].length;j++){
                
                if(board[i][j]==word.charAt(0)){
                    char save = board[i][j];
                    board[i][j] = ' ';
                    if(exists(board,i,j,word,1)){
                        return true;
                    }
                    board[i][j]=save;
                    
                }
            }
        }
        
        return false;
    }
    
    
    public boolean exists(char[][] board, int i, int j, String word,int wordIndex){
        if(wordIndex==word.length()) return true;
        
        if(i-1>=0 && board[i-1][j]==word.charAt(wordIndex)){
            char save = board[i-1][j];
            board[i-1][j]=' ';
            if(exists(board,i-1,j,word,wordIndex+1)) return true;
            board[i-1][j]=save;
        }
        
        if(i+1<board.length && board[i+1][j]==word.charAt(wordIndex)){
            char save = board[i+1][j];
            board[i+1][j]=' ';
            if(exists(board,i+1,j,word,wordIndex+1)) return true;
            board[i+1][j]=save;
        }
        
        if(j-1>=0 && board[i][j-1]==word.charAt(wordIndex)){
            char save = board[i][j-1];
            board[i][j-1]=' ';
            if(exists(board,i,j-1,word,wordIndex+1)) return true;
            board[i][j-1]=save;
        }
        
        if(j+1<board[0].length && board[i][j+1]==word.charAt(wordIndex)){
            char save = board[i][j+1];
            board[i][j+1]=' ';
            if(exists(board,i,j+1,word,wordIndex+1)) return true;
            board[i][j+1]=save;
        }
        
        return false;
        
    }
}
// Time Complexity : O(n^2)
// Space Complexity : O(n)