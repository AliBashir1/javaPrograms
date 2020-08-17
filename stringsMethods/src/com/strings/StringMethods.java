package com.strings;

import java.util.*;
import java.util.regex.Pattern;

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

        char chr ;
        int ind ;

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
     * @param compareToString (String) is string that is being compared.
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
     * @param caseSensitive (boolean) true if case sensitive false if not
     */

    public static void isSameString(String string1, String string2, boolean caseSensitive){
        String msg;


        if (caseSensitive){
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
        StringBuilder reverse = new StringBuilder();
        for (int i = str.length()-1; i >= 0; i--){
            reverse.append(str.charAt(i));
        }
        if (str.equalsIgnoreCase(reverse.toString())) return true; else return false;
    }

    /**
     * This method will divide the string into given number of characters if divisible
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
               // it'll keep printing char until i is equally divisible into number of part
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
                // checks if char from string exists in sourceString
                if (string.toLowerCase().charAt(i)  == duplicateSourceString.toLowerCase().charAt(j)){
                    isDuplicate = true;
                }
            }
            if (!isDuplicate)
                tempStr += string.charAt(i);
        }
        return tempStr;

    }

    /**
     * startWith checks for prefix in given string
     * @param string (String) a string to look into
     * @param prefix (String) a prefix to find in string
     * @param caseSensitive (boolean) if String is case sensitive;
     * @return (boolean)  true or false based on result
     */

    public static boolean startWith(String string, String prefix,  boolean caseSensitive){
        boolean isTrue;
        isTrue = (caseSensitive)? string.startsWith(prefix):
                string.toLowerCase().startsWith(prefix);
       return isTrue;
    }

    /**
     *  Checks if two strings are anagram.
     * @param string1 (string)
     * @param string2 (string)
     * @return (boolean)
     */

    public static boolean isAnagram(String string1, String string2){
        String copyS1 = string1.replaceAll(" ", "");
        String copyS2 = string1.replaceAll(" ", "");

        if (copyS1.length() != copyS2.length())
            return false;

        char[] string1Char = copyS1.toCharArray();
        char[] string2Char = copyS2.toCharArray();

        Arrays.sort(string1Char);
        Arrays.sort(string2Char);

        return Arrays.equals(string1Char, string2Char);
    }

    /**
     * Reverses the given string.
     * @param string (String) a string to be reversed.
     * @return newString (String) a reversed string.
     */
    public static String reverseString(String string){
        String newString = "";
        int i;
        for (i = string.length()-1; i>=0; i--)
            newString +=string.charAt(i);
        return newString;

    }

    /**
     * Reverses the words in given string. This method uses reverseString method to reverse words.
     * @param string (String) a string to be reversed.
     * @return newString (String) a reversed string.
     */
    public static String reverseWords(String string){
        String newString= "";
        String[] words = string.split(" ");
        for (String s: words) {
            newString += reverseString(s) + " ";
        }
        return newString;
    }

    /**
     *  Method will count the maximum occurring character in string
     * @param str (String)
     * @return (char) a maximum occurring character
     */

    public static char maxOccurringChar(String str){
        int count = 0;
        int maxCount = -1;
        char maxChar = 0;

        for (char c : str.toCharArray()) {
            count=0;
            for (int i = 0; i <= str.length()-1; i++){
                if (c == str.charAt(i)){
                    count ++;
                }
            }
            if (maxCount < count){
                maxCount = count;
                maxChar= c;
            }
        }

        return maxChar;
    }

    /**
     * Display the count of substring occurrence in string
     * @param string (String) a string to be looked into for substring
     * @param substring (String) look up substring
     */

    public static void countSubStringInMainString(String string, String substring){
        String[] wordArray = string.split(" ");
        String msg;
        int occurrence =0;

        for (String word: wordArray) {
            if (word.contains(substring)){
                occurrence++;
            }
        }
        msg = (occurrence > 0) ?
                "\"" + substring + "\"" + " have occurred " + occurrence + " times in \"" + string + "\"":
                "\"" + substring + "\"" + " is not in \"" + string + "\"";
        System.out.println(msg);

    }

    /**
     * Method will concatenate strings on given number of times.
     * @param string (String) a string to concat
     * @param numberOfConcatenation number of concatenation
     * @return (String) a concatenated string
     */

    public static String concatNthTimes(String string, int numberOfConcatenation){
        String tempString= "";
        for (int i= 0; i < numberOfConcatenation; i++)
            tempString = tempString.concat(string);

        return tempString;
    }

    /**
     * Return characters on even index
     * @param string a string
     * @return a tempString
     */
    public static String evenChar(String string){
        String tempString = "";
        for (int i = 0; i <= string.length() -1 ; i++ ){
            if (i%2 == 0){
                tempString += string.charAt(i);
            }
        }
        return tempString;
    }

    /**
     * This method will return a string of given indexes.
     * @param string a string
     * @param indexes array of indexes
     * @return string if indexes are inbound
     */

    public static String stringFromGivenIndex(String string, int[] indexes){
        String tempString = "";
        for (int i :indexes) {
            try {
            tempString += string.charAt(i);
            } catch (StringIndexOutOfBoundsException e){
                System.out.println("Given index is out of bound. String length is "+ string.length());
                return null;
            }
        }

        return tempString;
    }

    /**
     *  Returns total of numbers in string -- for example "whhat234" will return 9;
     *
     * @param string a number containing string
     * @return (int) total of numbers in string
     */

    public static int sumOfNumberInString(String string){
        int total = 0;
        String oneCharString;

        for (char c : string.toCharArray()) {
           oneCharString =  Character.toString(c);
           // look for digits only
           if (Pattern.matches("\\d", oneCharString))
                total += Integer.parseInt(oneCharString);
        }
        return total;
    }



    /**
     *
     * Incomplete
     *
     */
    // Write a Java program to find first non-repeating character from a stream of characters

    public static void findFirstNonRepeating(String str) {
        // godisgood
        char c;
        int keepCount =1;
        int j = 1;
        for (int i = 0; i <= str.length() - 1; i++) {
            c = str.charAt(i);
            System.out.println("Reading: "+ c);
            for (j = keepCount ; j <= str.length() - 1; j++) {

                    if (c != str.charAt(j))
                        System.out.println(c + " is not repeating");
                    else {
                        keepCount = j;
                        break;
                    }

            }
        }
    }

    // what data structure can be used to sort data-- something similar to list in python ??
    public static void findMostFrequentWords(String str) {
        int count =0;
        String stringCopy = str;
       LinkedList <String> aList = new LinkedList<>();

        for (char c: stringCopy.toCharArray()) {
            for(int i = 0; i<stringCopy.length(); i++){
                if (c == stringCopy.charAt(i)){
                    count ++;
                }

            }
            if (count != 0) {
                stringCopy = stringCopy.replaceAll(Character.toString(c), " ");
                aList.add(Integer.toString(count) + '_' + c);
                System.out.println(stringCopy);

            }

            count =0;
        }

        System.out.println(aList);




    }











}
