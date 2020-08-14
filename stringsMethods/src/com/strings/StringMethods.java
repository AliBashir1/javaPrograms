package com.strings;
import java.util.*;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class StringMethods {

    static String outPutMessage;
    /**
     * findChar returns a char at given index
     * @param str a string type
     * @param index a int type
     *
     * */
    public static void findChar(String str, int index) {


        char chr = 0;
        try {
            chr = str.charAt(index);
            System.out.println(chr + " is found at " + index);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index is out of bound.");

        }
    }

    /**
     * finUnicode looks for a char a given index and return its unicode
     * @param str a string type
     * @param index a int type
     *
     * */

    public static void findUnicode(String str, int index){

        char chr = 0;
        int ind = -1;

        try{
            chr = str.charAt(index);
            // one way of doing this
            // System.out.println((int) c);

            // another way
            ind = str.codePointAt(index);
            System.out.println("Unicode code for character "+ chr +" at index " + index + " is " + ind + ".");

            // looks for a Unicode for character before the given index
            ind = str.codePointBefore(index);
            System.out.println("Unicode code for character "+ chr +" before the index " + index + " is " + ind + ".");


        } catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("Index is out of bound.");

        }
    }

    /**
     * unicodeCount method will find range of unicode at given indexes
     * @param str  (String) parameter which will be used to find unicode
     * @param beginIndex (int) starting point of counting unicode
     * @param endIndex (int) ending  point of counting unicode
     * */

    public static void unicodeCount(String str , int beginIndex, int endIndex){
        int i = -1;
        try {
            i = str.codePointCount(beginIndex, endIndex);
            System.out.println("Unicode code count is " + i + ".");
        } catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("Index is out of bound.");

        }

    }
    /**
     * compareLexicoString will compare strings lexicographically
     * @param sourceString  (String) is string you wanna compare to
     * @param compareToString (String) is string that is being compored.
     *
     * */
    public static void compareLexicoString(String sourceString, String compareToString){
        int i = -1;
         // negative value means source string is smaller
        // positive value means source string is bigger
        // 0 means both strings are equal
        i = sourceString.compareTo(compareToString);
        // ignore case use compareToIgnoreCase method
        String msg ;
        // msg gets String value based on i value
        outPutMessage = i < 0 ?
                ("\""+ sourceString + "\" is less than \"" + compareToString +"\""):
                ("\""+ compareToString + "\" is less than \"" + sourceString +"\"");
        System.out.println(outPutMessage);

    }

    /**
     * This method will look for sequence into given string
     * @param str (String) string to be looked into for sequence
     * @param sequence (String) a string sequence
     */


    public static void findCharSequence(String str, String sequence){
        String msg;
        msg  = str.contains(sequence) ?
                ("\"" + str + "\" contains " + "\"" +sequence+"\"" ):
                ("\"" + str + "\" doesn't contain " + "\"" +sequence+"\"" );
        System.out.println(msg);

    }

    /**
     * isSameString checks two strings if they are same or not
     * @param string1 (String) a string type
     * @param string2 (String) a String type
     * @param caseSenstive (boolean) true if case sensitive false if not
     */

    public static void isSameString(String string1, String string2, boolean caseSenstive){
        String msg;


        if (caseSenstive){
            msg = string1.equals(string2) ?
                    ("\"" + string1 + "\" equals " + "\"" +string2+"\"" ):
                    ("\"" + string1 + "\" doest equal to " + "\"" +string2+"\"" );

        } else {

            msg = string1.equalsIgnoreCase(string2) ?
                    ("\"" + string1 + "\" equals " + "\"" +string2+"\"" ):
                    ("\"" + string1 + "\" doest equal to " + "\"" +string2+"\"" );

        }

        System.out.println(msg);
    }

    /**
     * getIndexOfString will return index of alphabets in given string
     * @param str (String) to find index of alphabets
     */

    public static void getIndexOfString(String str){

        int index = -1;
        String msg;
        String alphabet = "abcdefghjklmnopqrstuvwxyz";

        for (char c: alphabet.toCharArray()) {
            index = str.toLowerCase().indexOf(c);
            msg = (index != -1)  ?
                (c + " index is " + index):
                (c + " not found");
            System.out.println(msg);
            }

        }


    /**
     *
     * @param originalString (String) the string
     * @param lookUpChar  (char)
     * @param replacementChar (
     * @return (String) a string with replaced char
     */
    public static String replaceChar(String originalString, char lookUpChar, char replacementChar){
        return originalString.replace(lookUpChar, replacementChar);

    }

    /**
     * checks if string is palindrome
     * @param str (String)
     * @return (boolean) true if string is palindrome, false otherwise.
     */

    public static boolean isPalindrome(String str){
        String reverse = "";
        for (int i = str.length()-1; i >=0; i--){
            reverse += str.charAt(i);
        }
        if (str.equalsIgnoreCase(reverse)) return true; else return false;
    }

    /**
     * This method will devide the string into given number of characters if divisible
     * @param str string to divide
     * @param n number of division
     */

    public static void divideString(String str, int n){
        int string_size = str.length();
        int parts;

        if (str.length()/ n !=0) {
            System.out.println(str + " is not divisible by" + n);
            return;
        } else {
            for (int i = 0; i <string_size; i++){
                // split into number of parts
               parts = string_size / n;
               // itll keep printing char until i is equally divisible into number of part
               if (i % parts == 0) System.out.println();
               System.out.println(str.charAt(i));
           }

        }


    }

    /**
     * remove common alphabet in string and source string
     * @param string  a string to be
     * @param duplicateSourceString a string you want to use as source of duplication
     * @return a new string with unique alphabets
     */

    public static String removeDuplicates(String string, String duplicateSourceString) {
        String tempStr = "";
        boolean isDuplicate ;
        for (int i = 0 ; i <string.length(); i++){
            isDuplicate = false;
            for (int j = 0; j <duplicateSourceString.length(); j++){
                if (string.toLowerCase().charAt(i)  == duplicateSourceString.toLowerCase().charAt(j)){
                    isDuplicate = true;
                }
            }
            if (!isDuplicate)
                tempStr += string.charAt(i);
        }
        return tempStr;
    }



    // what data structure can be used to sort data-- somethign similar to list in python ??
    public static void findMostFrequentWords(String str) {
        int[] valueArray ;
        int value;

        List <Character> alist = new ArrayList<Character>();
        HashMap<Character, Integer> occurenceTable = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (!occurenceTable.containsKey(c)) {
                occurenceTable.putIfAbsent(c,1);
            }else if (occurenceTable.containsKey(c)){
                value = occurenceTable.get(c);
                value+=1;
                occurenceTable.put(c, value);
            }

        }


        for (int i: occurenceTable.values()  ) {
            for (char c: occurenceTable.keySet()) {



                 }
            }
        }










}
