import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;
import org.graalvm.compiler.nodes.util.IntegerHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyMain {

    // Counts the number of words that starts with 'a' or 'A'
    public static int startsWithA(ArrayList<String> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).charAt(0) == 'a' || list.get(i).charAt(0) == 'A'){
                count++;
            }
        }
        return count;
    }

    // Adds a ! to each element in the ArrayList, returns an ArrayList
    public static ArrayList<String> makeExciting(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + "!");
        }
        return list;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i) == list2.get(j)){
                    return true;
                }
            }
        }
        return false;
    }


    // METHODS FOR THE HOMEWORK:

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) {
        int oddNumberCount = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 1 || list.get(i) % 2 == -1){
                oddNumberCount++;
            }
        }
        return oddNumberCount;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    // Unlike the other methods, the input is an array!
    public static ArrayList<Integer> convertToArrayList(int[] arr) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            a.set(i, arr[i]);
        }
        return a;
    }

    // Takes two **sorted** ArrayLists and merges them together into one big sorted ArrayList
    // (Hint: you may find it useful to use a while loop, as well as the remove() method).
    public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> merged = new ArrayList<Integer>();
        for (int i = 0; i < list1.size() + list2.size(); i++) {
            if (list1.get(i) < list2.get(i)){
                merged.set(i, list1.get(i));
            }else{
                merged.set(i, list2.get(i));
            }
        }
        return merged;
    }



    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
