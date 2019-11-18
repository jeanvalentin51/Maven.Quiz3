package rocks.zipcode.io.quiz3.generics;

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

        return null;
    }

    public SomeType findEvenOccurringValue() {
        Integer evenOccuringValue = 0;

        for (SomeType eachElement : this.array){
            if (getNumberOfOccurrences(eachElement) % 2 == 0) {
                evenOccuringValue = (Integer) eachElement;
            }
        }
        return (SomeType) evenOccuringValue;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {

        int counter = 0;
        for (SomeType eachElement : this.array){
            if (eachElement.equals(valueToEvaluate)) counter++;
        }
        return counter;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return null;
    }
}
