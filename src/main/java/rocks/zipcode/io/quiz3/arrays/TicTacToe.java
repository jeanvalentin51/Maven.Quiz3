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

        return matrix[0][rowIndex].equals(matrix[1][rowIndex].equals(matrix[2][rowIndex]));
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {

        return matrix[columnIndex][0].equals(matrix[columnIndex][1].equals(matrix[columnIndex][2]));
    }

    public String getWinner() {

        for (int i = 0; i < 3; i++) {
            //checking for rows
            checkValues(matrix[i][0], matrix[i][1], matrix[i][2]);
            if (isWinner) {
                return winner;
            }
        }
        for (int i = 0; i < 3; i++) {
            //checking for columns
            checkValues(matrix[0][i], matrix[1][i], matrix[2][i]);
            if (isWinner) {
                return winner;
            }
        }

        // checking diagonal
        checkValues(matrix[0][0], matrix[1][1], matrix[2][2]);
        if (isWinner) {
            return winner;
        }

        checkValues(matrix[0][2], matrix[1][1], matrix[2][0]);
        if (isWinner) {
            return winner;
        }

        return "";

    }

    private void checkValues(String charOne, String charTwo, String charThree) {

        if (charOne.equals(charTwo) && charTwo.equals(charThree) && charOne != " ") {
            if (charOne.equals("X")) {
                isWinner = true;
                winner = "X";
            } else if (charOne.equals("O")) {
                isWinner = true;
                winner = "O";
            } else {
                winner = "";
            }
        }
    }

    public String[][] getBoard() {
        return null;
    }
}
