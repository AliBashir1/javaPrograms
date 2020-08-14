package com.strings;

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
        String alphabet = "abcdefghjklmnopqrstuvwxyz";

        for (char c: alphabet.toCharArray()) {
            index = str.toLowerCase().indexOf(c);

            if (index != -1) {
                System.out.println(c + " index is " + index);
            } else {
                System.out.println(c + " not found");
            }
        }
    }









}
