

public class NQueens {

    static int N = 4;
    static boolean board[][] = new boolean[N][N];

    static boolean canIPlaceAQueen(int row, int col){
        // Check Above Row
        for(int i = row; i>=0 ; i--){
            if(board[i][col])
            {
                return false;
            }
        }
        // Check Left Diagonal
        for(int i = row, j = col; i >= 0 && j >=0; i--,j--){
            if(board[i][j]){
                return false;
            }
        }
        //Check Right Diagonal
        for(int i = row, j = col; i >= 0 && j < board.length; i--,j++){
            if(board[i][j])
            {
                return false;
            }
        }
        return true;
    }
    static int countNumberOfWays(int row){
        int count = 0;
        if(row == board.length){
            return 1;
        }
        for(int col = 0; col < board.length; col++)
        {
            //Check the Queen can Place on Cell
            if(canIPlaceAQueen(row,col)){
                board[row][col] = true; // Place the Queen
                count = count + countNumberOfWays(row+1);
                board[row][col] = false;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countNumberOfWays(0));
    }
}
