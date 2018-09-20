import java.util.ArrayList;

public class OperateCheckerboard {
    int[][] chessBoard = {{1,1,1,1,1,1,1,1,1,1},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,1,1,1,1,1,0},
            {0,0,0,0,1,0,0,0,0,0},
            {0,0,0,0,1,2,1,1,1,1},
            {0,0,0,0,1,0,1,1,1,1},
            {0,0,0,0,1,0,1,1,1,1},
            {0,1,1,1,1,1,1,1,1,1},
            {0,1,1,1,1,1,1,1,1,1},
            {0,1,1,1,1,1,1,1,1,1}};
    ArrayList<Integer> node = new ArrayList<Integer>();
    ArrayList<Integer> node1 = new ArrayList<Integer>();
    int result=0;
    public void solusion(int x_index, int y_index){
        IsZero(x_index, y_index);
        System.out.print("result= "+result);

    }

    public void IsZero(int x_index,int y_index){
        if(x_index-1>=0 && x_index-1<10 &&
                x_index+1>=0 && x_index+1<10 &&
                y_index-1>=0 && y_index-1<10 &&
                y_index+1>=0 && y_index+1<10) {
            if (chessBoard[x_index - 1][y_index] == 0) {
                node.add(chessBoard[x_index - 1][y_index]);
                for (int i = x_index - 2; i >= 0; i--) {
                    if (chessBoard[i][y_index] == 0) {
                        node.add(chessBoard[i][y_index]);
                        if(i==0){
                            result=1;
                        }
                    }
                }
            }
            if (chessBoard[x_index][y_index - 1] == 0) {
                node.add(chessBoard[x_index][y_index - 1]);
                if (y_index - 2 >= 0 || y_index - 2 < 10) {
                    node1.add(chessBoard[x_index][y_index - 2]);
                    for (int i = y_index - 2; i >= 0; i--) {
                        if (chessBoard[x_index][i] == 0) {
                            node.add(chessBoard[x_index][i]);
                            if(i==0){
                                result=1;
                            }
                        }
                    }
                }
            }
            if (chessBoard[x_index + 1][y_index] == 0) {
                node.add(chessBoard[x_index + 1][y_index]);
                for (int i = x_index + 2; i < 10; i++) {
                    if (chessBoard[i][y_index] == 0) {
                        node.add(chessBoard[x_index][i]);
                        if(i==9){
                            result=1;
                        }
                    }
                }
            }
                if (chessBoard[x_index][y_index + 1] == 0) {
                    node.add(chessBoard[x_index][y_index + 1]);
                    for (int i = y_index + 2; i < 10; i++) {
                        if (chessBoard[x_index][i] == 0) {
                            node.add(chessBoard[x_index][i]);
                            if(i==9){
                                result=1;
                            }
                        }
                    }
                }
            }
    }
}
