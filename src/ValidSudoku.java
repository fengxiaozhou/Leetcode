import java.util.HashSet;
import java.util.Set;

/**
 * @author Fz
 * @date 2018/10/20 20:30
 */
public class ValidSudoku {
    /**
     * 真的是精彩的代码！！！
     * @param board
     * @return
     */
    public boolean isValidSudoku(char[][] board){
        Set set= new HashSet();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char number=board[i][j];
                if(number!='.'){
                    if(!set.add(number+"in row"+i)||
                            !set.add(number+"int column"+j)||
                            !set.add(number+"in block"+i/3+j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
