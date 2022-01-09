package com.practice.nagarro.mettl;

/**
 *  Programme to convert C++ class name to Java class name
 *  input  C++ class name underscore_versus_capital_and_lower_case_variable_naming
 *  output java class name underscoreVersusCapitalAndLowerCaseVariableNaming
 *  and viceversa
 */
public class CaseChanges {
    public static void main(String[] args) {
        String str1 = "underscore_versus_capital_and_lower_case_variable_naming";
        System.out.println(convertToJavaString(str1));
        String str2 = "iGotAnInternInGeeksForGeeks";
        System.out.println(convertToCString(str2));
    }

    static String convertToJavaString(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str.contains("_")) {
            String[] chars = str.split("_");
            stringBuffer.append(chars[0]);
            for (int i = 1; i < chars.length; i++) {
                stringBuffer.append(Character.toUpperCase((chars[i].charAt(0)))).append(chars[i].substring(1).toLowerCase());
            }
        }
        return stringBuffer.toString();
    }

    static String convertToCString(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        char[] chars = str.toCharArray();
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                stringBuffer.append(str.substring(index, i) + "_");
                index = i;
            }
        }
        stringBuffer.append(str, index, str.length());
        return stringBuffer.toString();
    }
}
