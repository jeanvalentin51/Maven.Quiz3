package rocks.zipcode.io.quiz3.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {

        SomeType evenOccuringValue = null;

        for (SomeType eachElement : this.array){
            if (getNumberOfOccurrences(eachElement) % 2 != 0) {
                evenOccuringValue = eachElement;
            }
        }
        return evenOccuringValue;
    }

    public SomeType findEvenOccurringValue() {
        SomeType evenOccuringValue = null;

        for (SomeType eachElement : this.array){
            if (getNumberOfOccurrences(eachElement) % 2 == 0) {
                evenOccuringValue = eachElement;
            }
        }
        return evenOccuringValue;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {

        int counter = 0;
        for (SomeType eachElement : this.array){
            if (eachElement.equals(valueToEvaluate)) counter++;
        }
        return counter;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        Object[] results = Arrays.stream(array).filter(predicate :: apply).toArray();
        SomeType[] result = Arrays.copyOf(array,results.length);

        for (int i = 0; i < results.length; i++){
            result[i] = (SomeType) results[i];
        }
        return result;
    }
}
