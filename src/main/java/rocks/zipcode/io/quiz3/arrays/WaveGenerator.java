package rocks.zipcode.io.quiz3.arrays;


import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        String [] result = str.split("");

        for (int i = 0; i < str.length(); i++) {
            StringUtils.capitalizeNthCharacter(str, i);
        }
        return result;
    }
}
