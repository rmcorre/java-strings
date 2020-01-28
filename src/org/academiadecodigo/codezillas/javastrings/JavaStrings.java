package org.academiadecodigo.codezillas.javastrings;

/**
 * My API for string methods
 */
public class JavaStrings {

    /**
     * Inefficient method of removing a char from a string.
     * Because strings in Java are immutable, this method must create
     * a new String object with the result from two intermediate String objects.
     *
     * @param str   string to operate on
     * @param n     index of char to remove
     */
    public static String removeChar1(String str, int n ) {
        String result = str.substring(0, n) + str.substring(n + 1);
        return result;
    }

    /**
     * This method is more efficient because the StringBuilder class is mutable.
     * It has a method {@link java.lang.StringBuilder#deleteCharAt(int) deleteCharAt(int)} along with many
     * other mutator methods. This avoids creation of unnecessary String objects.
     *
     * @param str   String to operate on
     * @return      String with the removed char
     */
    public static String removeChar2(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.deleteCharAt(3).toString();
    }

}
