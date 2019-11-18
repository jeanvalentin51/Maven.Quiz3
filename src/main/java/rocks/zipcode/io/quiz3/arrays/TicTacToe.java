package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

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
        String one = matrix[rowIndex][0];
        String two = matrix[rowIndex][1];
        String three = matrix[rowIndex][2];

        return one.equals(two) && one.equals(three);
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {

        String one = matrix[0][columnIndex];
        String two = matrix[1][columnIndex];
        String three = matrix[2][columnIndex];

        return one.equals(two) && one.equals(three);
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
