package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {

    static int counter = 0;

    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        char character;
        String result = "";
        character = str.charAt(indexToCapitalize);
        result = str.substring(0,indexToCapitalize) + Character.toUpperCase(character) + str.substring(indexToCapitalize + 1,str.length()
        );
        return result;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {

        for (int i = 0; i < baseString.length(); i++){
            if (baseString.charAt(indexOfString) == characterToCheckFor){
                return true;
            }
        }

            return false;
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
            counter++;
            for (int k = i + 1; k < word.length; k ++){
                interim = interim.concat(word[k]);
                temp.add(interim);
                counter++;
            }
        }
        result = new String[temp.size()];
        return temp.toArray(result);
    }

    public static Integer getNumberOfSubStrings(String input){
        String [] temp = input.split(" ");

        for (String each : temp){
            getAllSubStrings(each);
        }

        return counter;
    }
}
