package BackTracking;
//Q4. Check if the product of some subset of an array is equal to the
//
//target value.
public class Ass5 {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
        System.out.println(countNQueens(board,0));

    }
    public static int countNQueens(boolean[][] board,int row){

        if(row==board.length){
            return 1;
        }
        int count=0;
        for(int c=0; c<board[0].length;c++){
            if(isSafe(board,row,c)){
                board[row][c]=true;
                count+=countNQueens(board,row+1);
                board[row][c]=false;
            }
        }
        return count;
    }
    public static boolean isSafe(boolean[][] board, int row,int column){
        for(int i=0;i<row;i++){
            if (board[i][column]){
                return false;
            }
        }
        int maxLeft=Math.min(row,column);
        for(int i=1; i<=maxLeft; i++){
            if(board[row-i][column-i]){
                return false;
            }
        }
        int maxRight=Math.min(row,board[0].length-1-column);
        for(int i=1; i<=maxRight; i++){
                if(board[row-i][column+i]){
                    return false;
                }

        }
        return true;

    }

}
