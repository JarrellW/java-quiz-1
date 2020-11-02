
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        String answer = baseValue + valueToBeAdded;
        return answer;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String string = valueToBeReversed;
        String reverse = new StringBuffer(string).reverse().toString();
        return reverse;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {

        int middleIndex = word.length() / 2;
        char middleLetter = word.charAt(middleIndex);
        return middleLetter;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {

        StringBuilder answer = new StringBuilder(value);

        while(answer.toString().indexOf(charToRemove) != -1) {
            answer = answer.deleteCharAt(answer.toString().indexOf(charToRemove));
        }
         return answer.toString();

//       String answer = "";
//       for(int i = 0; i < value.length(); i++){
//           if( != charToRemove)
//           if(Character.isWhitespace(phrase.charAt(c)))
//       }

    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence){
        String answer = sentence;
        String lastWord = answer.substring(answer.lastIndexOf(" ")+1);
        return lastWord;
    }
}
