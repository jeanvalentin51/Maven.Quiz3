package rocks.zipcode.io.quiz3.arrays;


import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {

        ArrayList<String> temp = new ArrayList<>();
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                temp.add(StringUtils.capitalizeNthCharacter(str, i));
            } else {

            }
        }

        String[] result = new String[temp.size()];
        temp.toArray(result);

        return result;
    }
}
