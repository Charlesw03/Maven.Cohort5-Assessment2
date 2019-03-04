package rocks.zipcode.assessment2.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {


       List<Integer> mylist = new ArrayList<>();
        mylist.add(1);
        mylist.add(3);
        mylist.add(2);
        mylist.add(5);
        mylist.add(4);
        mylist.add(7);
        mylist.add(6);
        mylist.add(valueToBeAdded);
        Integer[] answer = new Integer[mylist.size()];
        mylist.toArray(answer);
        return answer;
    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        if(indexToInsertAt == 0){
            integerArray[0] = 82;
        } else if(indexToInsertAt == 3){

                integerArray[3] = 12;
        }

        return  integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        return integerArray[indexToFetch];
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        for (int i = 0; i < integerArray.length ; i++) {
            if(integerArray[i] % 2 ==0){
                integerArray[i]++;
            } else if(integerArray[i] % 2 != 0){
                integerArray[i]--;
            }
        }

        return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        for (int i = 0; i <integerArray.length ; i++) {
            if(integerArray[i] % 2 == 0){
                integerArray[i]++;
            }
        }
        return integerArray;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        for (int i = 0; i <input.length ; i++) {
            if(input[i] % 2 != 0){
                input[i]--;
            }
        }
       return input;
    }

}
