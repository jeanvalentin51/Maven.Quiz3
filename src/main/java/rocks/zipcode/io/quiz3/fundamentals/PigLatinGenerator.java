package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {


        if (VowelUtils.startsWithVowel(str) == true) {
            return str.concat("way");
        }
        if (VowelUtils.startsWithVowel(str) == false) {
            return translateWord(str);
        }

        if (VowelUtils.hasVowels(str) == false) {
            return str.concat("ay");
        }

        return null;
    }

    private String translateWord(String word) {
        String result = "";
        int index = 0;

        String[] phrase = word.split(" ");

        if (phrase.length > 1) {
            result = translatePhrase(phrase);
        } else {

            for (int i = 0; i < word.length(); i++) {
                index = i;

                if (VowelUtils.startsWithVowel(String.valueOf(word.charAt(i))) == true) {
                    break;
                }
            }
            result = word.substring(index, word.length()).concat(word.substring(0, index)).concat("ay");
        }


        return result;
    }

    private String translatePhrase(String[] phrase) {
        String result = "";

        for (int i = 0; i < phrase.length; i++){
            result = result.concat(translate(phrase[i])).concat(" ");
        }
        return result.trim();
    }
}
