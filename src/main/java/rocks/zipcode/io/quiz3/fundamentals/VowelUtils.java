package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        String [] vowels = {"a","e", "i", "o", "u"};
        StringBuilder s = new StringBuilder(word);

        for (String each : vowels){
            if (s.indexOf(each) > 0) return true;
        }

        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        Integer index = 0;
        String [] vowels = {"a","e", "i", "o", "u"};
        String [] wordLetters = word.split("");

        for (int i = 0; i < wordLetters.length; i++){
            for (int k = 0; k < vowels.length; k ++){
                if (wordLetters[i].toLowerCase().equals(vowels[k])) return i;
            }
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {

        return (getIndexOfFirstVowel(word) == 0);
    }

    public static Boolean isVowel(Character character) {
        return null;
    }
}
