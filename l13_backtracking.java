import java.util.ArrayList;
import java.util.List;

public class l13_backtracking {
    //Q1 : printing all the permutations of arranging n strudents in chairs
    // public static void printPermutations(String str , String perm ,int idx){
    //     //basecase
    //     if(str.length()==0){
    //         System.out.println(perm);
    //         return;
    //     }
    //     for(int i=0;i<str.length();i++){
    //         char curChar = str.charAt(i);
    //         String newstr = str.substring(0, i)+str.substring(i+1);
    //         printPermutations(newstr, perm + curChar, idx+1);
    //     }
    // }



    //Q2: n queens problem (chess)
    public boolean isSafe(int row,int col ,char[][] board){
        //horizontal
        for(int j =0; j< board.length;j++){
            if(board[row][j]=='Q'){
                return false;
            }
        }

        //vertical
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //upper left
        int r = row;
        for(int c= col ; c>=0 && r>=0;c--,r--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        //uper right
        // int r = row;
        for(int c= col ; c<board.length && r>=0;r--,c++){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        //lower left
        for(int c= col ; c>=0 && r<board.length;r++,c--){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        //lower right
        for(int c= col ; c<board.length && r<board.length;r++,c++){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        return true;

    }

    public void saveBoard(char[][] board ,List<List<String>> allBoard){
        String row ="";
        List<String> newBoard = new ArrayList<>();

        for(int i=0;i<board.length;i++){
            row="";
            for(int j =0;j<board[0].length;j++){
                if(board[i][j]=='Q'){
                    row += 'Q';
                }else{
                    row += '.';
                }
                newBoard.add(row);
            }
            allBoard.add(newBoard);
        }
    }

    public void helper(char[][] board ,List<List<String>> allBoard, int col){
        for(int row = 0;row<board.length;row++){
            //basecase 
            if(col == board.length){
                saveBoard(board,allBoard);
                return;
            }
            if(isSafe(row,col,board)){
                board[row][col]= 'Q';
                helper(board, allBoard, col+1);
                board[row][col] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n){

        List<List<String>> allBoard = new ArrayList<>();
        char[][] board = new char[n][n];
        return allBoard;
    }
    public  static void main(String[] args){

        //Q1 : printing all the permutations of arranging n strudents in chairs
        // String str = "ABC";
        // printPermutations(str, "", 0);



        //Q2: n queens problem (chess)
        int n = 4;
    }
}
