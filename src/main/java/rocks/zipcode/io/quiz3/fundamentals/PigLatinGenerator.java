package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {


        if (VowelUtils.startsWithVowel(str) == true) {
            return str.concat("way");
        }

        if (VowelUtils.hasVowels(str) == false){
            return str.concat("ay");
        }

        return null;
    }
}
