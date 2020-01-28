package org.academiadecodigo.codezillas.javastrings;

public class App {

    public static void main(String[] args) {

        String newString = JavaStrings.removeChar1("Robocop", 3);
        System.out.println(newString);

        String str2 = JavaStrings.removeChar2("Robocop");
        System.out.println(str2);
    }
}
