package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        char character;
        String result = "";
        character = str.charAt(indexToCapitalize);
        result = str.substring(0,indexToCapitalize) + Character.toUpperCase(character) + str.substring(indexToCapitalize + 1,str.length()
        );
        return result;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return null;
    }

    public static String[] getAllSubStrings(String string) {
        ArrayList<String> temp = new ArrayList<>();
        String [] word = string.split("");
        String interim = "";
        String [] result;

        for (int i = 0; i < word.length; i++){
            interim = "";
            temp.add(word[i]);
            interim = word[i];
            for (int k = i + 1; k < word.length; k ++){
                interim = interim.concat(word[k]);
                temp.add(interim);
            }
        }
        result = new String[temp.size()];
        return temp.toArray(result);
    }

    public static Integer getNumberOfSubStrings(String input){
        return null;
    }
}
