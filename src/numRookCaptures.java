/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-26
 */
public class numRookCaptures {
    public int numRookCaptures(char[][] board) {

        int sum = 0;

        int row = -1;
        int col = -1;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    row = i;
                    col = j;
                }
            }
        }

        if (row == -1) {
            return 0;
        } else {

            for (int i = row-1; i >= 0; i++) {
                if(board[i][col] == 'p'){
                    sum++;
                    break;
                }
                if(board[i][col] == 'B'){
                    break;
                }
            }
            for (int i = row+1; i <8; i++) {
                if(board[i][col] == 'p'){
                    sum++;
                    break;
                }
                if(board[i][col] == 'B'){
                    break;
                }
            }

            for (int i = col+1; i <8; i++) {
                if(board[row][i] == 'p'){
                    sum++;
                    break;
                }
                if(board[row][i] == 'B'){
                    break;
                }
            }

            for (int i = col-1; i >=0; i++) {
                if(board[row][i] == 'p'){
                    sum++;
                    break;
                }
                if(board[row][i] == 'B'){
                    break;
                }
            }

        }

        return sum;

    }
}
