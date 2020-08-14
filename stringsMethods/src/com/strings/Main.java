package com.strings;

import com.sun.xml.internal.rngom.parse.compact.UCode_UCodeESC_CharStream;

public class Main {
    public static void main (String[] args){
        String orignalString = "What are you doing";
        String string1 = " This is Good 1 ";
        String string2 = "msg";
        String testString = "";


      /*
        // prints
        StringMethods.unicodeCount(orignalString, 1, 3);

        // compare strings lexicographically
        StringMethods.compareLexicoString(string1, string2);

        // prints resule of sequence exits in given string or not
        StringMethods.findCharSequence(orignalString, "are");

        // checks if both strings are same
        StringMethods.isSameString(string1, string2, true);


        // display index of all alphabet exits in string
        StringMethods.getIndexOfString(orignalString);

        // replace char
        testString = StringMethods.replaceChar(orignalString,'a', ' ');


        // check if string is Palindrome

        System.out.println(StringMethods.isPalindrome(testString));

       */

       testString= StringMethods.removeDuplicates(string1, string2);
        System.out.println(testString);

//        StringMethods.findMostFrequentWords("whataseett");



    }
}
