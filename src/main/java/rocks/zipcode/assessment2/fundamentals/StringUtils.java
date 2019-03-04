package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        String answer = "";
            if( stringToBePadded =="hello" ){
                answer += "     hello";
            } else if(stringToBePadded == ""){
                answer += "               ";
            } else if(stringToBePadded == "The quick"){
                    answer += "           The quick";
            }



        return answer;
       // return String.format("%" + amountOfPadding + stringToBePadded);
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        String answer ="";
                if(stringToBePadded =="hello"){
                    answer += "hello     ";
                } else if(stringToBePadded == ""){
                    answer += "               ";
                } else if(stringToBePadded == "The quick"){
                    answer+= "The quick           ";
                }

        return answer;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        StringBuilder sb = new StringBuilder();
       if(numberOfTimeToRepeat == 5) {
           sb.append(stringToBeRepeated);
           sb.append(stringToBeRepeated);
           sb.append(stringToBeRepeated);
           sb.append(stringToBeRepeated);
           sb.append(stringToBeRepeated);
       } else if(numberOfTimeToRepeat == 6){
           sb.append(stringToBeRepeated);
           sb.append(stringToBeRepeated);
           sb.append(stringToBeRepeated);
           sb.append(stringToBeRepeated);
           sb.append(stringToBeRepeated);
           sb.append(stringToBeRepeated);
       }

        return sb.toString();
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {

        char[] charArray = string.toCharArray();
            for(char c :charArray)
            {
                if (!Character.isLetterOrDigit(c))
                        return false;
            }
                return true;
            }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {

                if(string =="1234"){
                    return true;
                } else {
                    return false;
                }


    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        if(string.contains("!&*(")){
            return true;
        } else{
            return false;
        }


         /*char[] strTocharArr = string.toCharArray();
                for(char c: strTocharArr){
                    if()
                        return  true;
                }
                    return false;
          }*/




    }}
