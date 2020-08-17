package com.strings;
import java.io.*;
import com.sun.xml.internal.rngom.parse.compact.UCode_UCodeESC_CharStream;

public class Main {
    public static void main (String[] args){
        String originalString = "What are you doing";
        String string1 = "java123what322";
        String string2 = "java";
        char[] aCharSeq = {'a','b','c','d', 'e', 'f'};
        char[] aEmptyCharSeq = new char[100];
        String aSeq = "abs";
        String testString ;
        char aChar;
        int aTestint;
        boolean aTestBool;



//        String[][] myMatrix = new String[string1.length()][string1.length()];
//        myMatrix[0][1] = "c";
//        myMatrix[0][0] = "2";
//        System.out.println(myMatrix[0][0]);




        /***********************
        * String Builtin Methods
        ************************/
        /*

        // returns char at index -- h
        aChar = originalString.charAt(1);

        // return unicode at given index - unicode of h is 104
        aTestint = originalString.codePointAt(0);
        // return a unicode before the specific index.
        aTestint = originalString.codePointBefore(1 );
        // return unicode count of given range
        aTestint = originalString.codePointCount(0, 3);

        // compare strings  lexicographically -- using unicode
        // negative represent "less than"
        // positive represent "more than"
        // 0 represents equal
        aTestint= string1.compareTo(string2);
        aTestint= string1.compareToIgnoreCase(string2);

        // add string at the end -- return new string
        testString = string1.concat(string2);

        // checks if abc contains in string1
//        aTestBool = string1.contains("ar");

        // check for contents
        aTestBool = string1.contentEquals(string2);

        // copies chat array into string -- return string
        testString= String.copyValueOf(aCharSeq);

        // copies char array into new string given offset and count -- return string
        testString = String.copyValueOf(aCharSeq, 1, 3);

         */
        // check if content of strings are same and return boolen value
//        aTestBool= string1.equals(string2);
//        aTestBool= string1.equalsIgnoreCase(string2);
//        string1.getChars(0,1, aEmptyCharSeq = new char[string1.length()],0);
//        System.out.println(aEmptyCharSeq);





      /*
        // prints
        StringMethods.unicodeCount(originalString, 1, 3);

        // compare strings lexicographically
        StringMethods.compareLexicoString(string1, string2);

        // prints resule of sequence exits in given string or not
        StringMethods.findCharSequence(originalString, "are");

        // checks if both strings are same
        StringMethods.isSameString(string1, string2, true);


        // display index of all alphabet exits in string
        StringMethods.getIndexOfString(originalString);

        // replace char
        testString = StringMethods.replaceChar(originalString,'a', ' ');


        // check if string is Palindrome

        System.out.println(StringMethods.isPalindrome(testString));



       testString= StringMethods.removeDuplicates(string1, string2);
        // maximum occurring character
        aChar = StringMethods.maxOccurringChar("what are you doiiiinnnniiiiiiig");

       // find occurrence of given string in anther string
        StringMethods.countSubStringInMainString("god is good", "1");

       // concat string nth times
         testString = StringMethods.concatNthTimes("what", 0);




       testString = StringMethods.evenChar("w3resource.com");


        int[] indexes = {1,2,5};

        testString =StringMethods.stringFromGivenIndex("what", indexes);

       */

         aTestint = StringMethods.sumOfNumberInString("whatwhat87hdha890");
        System.out.println(aTestint);

;









    }
}
