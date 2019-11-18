package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    /**
     * Given two shuffled arrays `inputArray`, and `squareValues`,
     * ensure each `element` of `inputArray` has a corresponding `value` in `squaredValues`
     * such that `element == value*value`
     *
     * @param inputArray    an array of integers
     * @param squaredValues an array of integers
     * @return true if each `inputArray[i]` has a corresponding `squaredValues[j]` such that `squaredValues[j] == inputArray[i] * inputArray[i]`
     */

    static Integer counter = 0;
    public static Boolean compare(Integer[] inputArray, Integer[] squaredValues) {
        counter = inputArray.length;
        for (Integer each : inputArray) {
            checkValue(squaredValues,each);
        }
        return counter <= 0;
    }

    static void checkValue (Integer [] squaredValues, Integer value){
        for (int i = 0; i < squaredValues.length; i++){
            if (squaredValues[i] == value * value) counter --;
        }
    }
}
