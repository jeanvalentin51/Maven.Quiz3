package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    String [][] matrix;
    boolean isWinner = false;
    String winner = "";

    public TicTacToe(String[][] board) {
        this.matrix = board;
    }

    public TicTacToe() {
    }


    public String[] getRow(Integer value) {

        String [] result = new String[matrix.length];

        for (int i = 0; i < matrix.length; i ++){
            result[i] = matrix[value][i];
        }
        return result;
    }

    public String[] getColumn(Integer value) {
        String [] result = new String[matrix.length];

        for (int i = 0; i < matrix.length; i ++){
            result[i] = matrix[i][value];
        }
        return result;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        return null;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        return null;
    }

    public String getWinner() {
        return null;
    }

    public String[][] getBoard() {
        return null;
    }
}
